package org.entity;

import java.net.URL;
import java.util.Set;

public class TvShow  {

    private URL url;
    private String name;
    private Set<String> genres;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "TvShow{url=" + url +
                ", name='" + name + '\'' +
                ", genres=" + genres +
                '}';
    }
}
