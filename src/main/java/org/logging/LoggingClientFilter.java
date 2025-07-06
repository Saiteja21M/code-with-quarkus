package org.logging;

import jakarta.annotation.Priority;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.client.ClientResponseFilter;
import jakarta.ws.rs.ext.Provider;
import org.jboss.logging.Logger;

import java.io.IOException;

@Provider
@Priority(Priorities.USER)
public class LoggingClientFilter implements ClientRequestFilter, ClientResponseFilter {
    private static final Logger LOG = Logger.getLogger(LoggingClientFilter.class);

    @Override
    public void filter(ClientRequestContext requestContext) {
        LOG.debugf("Client Request: %s %s", requestContext.getMethod(), requestContext.getUri());
        LOG.debugf("Request Body: %s", requestContext.getEntity() != null ? requestContext.getEntity() : "No body");
        // To log body, buffer and read entity stream if needed
    }

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
        LOG.debugf("Client Response: %d", responseContext.getStatus());

        if (responseContext.hasEntity()) {
            java.io.InputStream originalStream = responseContext.getEntityStream();
            String body = new String(originalStream.readAllBytes(), java.nio.charset.StandardCharsets.UTF_8);
            LOG.debugf("Response Body: %s", body);
            // Replace the stream so the entity can be read later
            responseContext.setEntityStream(new java.io.ByteArrayInputStream(body.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        } else {
            LOG.debug("Response Body: No body");
        }
        // To log body, buffer and read entity stream if needed
    }
}