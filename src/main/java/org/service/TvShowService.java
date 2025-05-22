package org.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.client.TvShowClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.entity.TvShow;

import java.util.List;

@ApplicationScoped
public class TvShowService {

    @RestClient
    TvShowClient tvShowClient;

    public List<TvShow> getTvShow(String q) {
        return tvShowClient.getTvShow(q);
    }

}
