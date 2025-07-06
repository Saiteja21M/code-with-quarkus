package org.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.entity.TvShow;
import org.logging.LoggingClientFilter;

import java.util.List;

@Path("/search")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@RegisterProvider(LoggingClientFilter.class)
@ApplicationScoped
public interface TvShowClient {

    @GET
    @Path("shows")
    List<TvShow> getTvShow(@QueryParam("q") String q);
}