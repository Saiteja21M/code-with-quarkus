package org.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.entity.TvShow;
import org.service.TvShowService;

@Path("/home")
public class GreetingResource {

    @Inject
    TvShowService tvShowService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST - How are you today?";
    }

    @GET
    public Response getTvShow() {
        TvShow tvShow = tvShowService.getTvShow();
        if (tvShow != null) {
            Response.ok(tvShow);
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
