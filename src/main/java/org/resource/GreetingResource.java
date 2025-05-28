package org.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/home")
public class GreetingResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello there!!.. How are you today?";
    }

}
