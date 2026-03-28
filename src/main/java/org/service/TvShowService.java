package org.service;

import io.quarkus.cache.CacheResult;
import jakarta.enterprise.context.ApplicationScoped;
import org.client.TvShowClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.model.TvShow;

import java.util.List;

@ApplicationScoped
public class TvShowService {

    @RestClient
    TvShowClient tvShowClient;

    @CacheResult(cacheName = "tv-show-cache")
    public List<TvShow> getTvShow(String q) {
        return tvShowClient.getTvShow(q);
    }

}
