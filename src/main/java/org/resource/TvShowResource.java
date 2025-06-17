package org.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import org.entity.TvShow;
import org.jboss.logging.Logger;
import org.service.TvShowService;

import java.util.List;

@Path("show")
public class TvShowResource {

    @Inject
    TvShowService tvShowService;

    @Inject
    Logger logger;

    @GET
    @Produces("application/json")
    public Response getTvShow(@QueryParam("showName") String showName) {
        logger.info("searched for " + showName);
        List<TvShow> tvShows = tvShowService.getTvShow(showName);
        if (tvShows != null && !tvShows.isEmpty()) {
            logger.debug("received result " + tvShows);
            return Response.ok(tvShows).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
