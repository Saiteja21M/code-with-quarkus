package org.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.entity.TvShow;

@Path("/shows")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@ApplicationScoped
public interface TvShowClient {

    @GET
    @Path("/2")
    TvShow getTvShow();
}