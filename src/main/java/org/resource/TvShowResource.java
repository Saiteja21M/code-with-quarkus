package org.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.entity.TvShow;
import org.service.TvShowService;

@Path("show")
public class TvShowResource {

    @Inject
    TvShowService tvShowService;

    @GET
    public Response getTvShow() {
        TvShow tvShow = tvShowService.getTvShow();
        if (tvShow != null) {
            Response.ok(tvShow);
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
