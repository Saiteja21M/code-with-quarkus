package org.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TvShow {
    private Show show;

    @Data
    public static class Show {
        private int id;
        private String url;
        private String name;
        private String type;
        private String language;
        private List<String> genres;
        private String status;
        private int runtime;
        private int averageRuntime;
        private String premiered;
        private String ended;
        private String officialSite;
        private Schedule schedule;
        private Rating rating;
        private int weight;
        private Network network;
        private Image image;
        private String summary;
        private long updated;
        @JsonProperty("_links")
        private Links links;

        @Override
        public String toString() {
            return "Show{" +
                    "id=" + id +
                    ", url='" + url + '\'' +
                    ", name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", language='" + language + '\'' +
                    ", genres=" + genres +
                    ", status='" + status + '\'' +
                    ", runtime=" + runtime +
                    ", averageRuntime=" + averageRuntime +
                    ", premiered='" + premiered + '\'' +
                    ", ended='" + ended + '\'' +
                    ", officialSite='" + officialSite + '\'' +
                    ", schedule=" + schedule +
                    ", rating=" + rating +
                    ", weight=" + weight +
                    ", network=" + network +
                    ", image=" + image +
                    ", summary='" + summary + '\'' +
                    ", updated=" + updated +
                    ", _links=" + links +
                    '}';
        }
    }

    @Data
    public static class Schedule {
        private String time;
        private List<String> days;

        // Getters and Setters
        @Override
        public String toString() {
            return "Schedule{" +
                    "time='" + time + '\'' +
                    ", days=" + days +
                    '}';
        }
    }

    @Data
    public static class Rating {
        private double average;

        // Getters and Setters
        @Override
        public String toString() {
            return "Rating{" +
                    "average=" + average +
                    '}';
        }
    }

    @Data
    public static class Network {
        private int id;
        private String name;
        private Country country;
        private String officialSite;

        @Override
        public String toString() {
            return "Network{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", country=" + country +
                    ", officialSite='" + officialSite + '\'' +
                    '}';
        }
    }

    @Data
    public static class Country {
        private String name;
        private String code;
        private String timezone;

        // Getters and Setters
        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", code='" + code + '\'' +
                    ", timezone='" + timezone + '\'' +
                    '}';
        }
    }

    @Data
    public static class Externals {
        private Object tvrage; // Can be null
        private int thetvdb;
        private String imdb;

        // Getters and Setters
        @Override
        public String toString() {
            return "Externals{" +
                    "tvrage=" + tvrage +
                    ", thetvdb=" + thetvdb +
                    ", imdb='" + imdb + '\'' +
                    '}';
        }
    }

    @Data
    public static class Image {
        private String medium;
        private String original;

        // Getters and Setters
        @Override
        public String toString() {
            return "Image{" +
                    "medium='" + medium + '\'' +
                    ", original='" + original + '\'' +
                    '}';
        }
    }

    @Data
    public static class Links {
        private Self self;
        private PreviousEpisode previousepisode;

        // Getters and Setters
        @Override
        public String toString() {
            return "Links{" +
                    "self=" + self +
                    ", previousepisode=" + previousepisode +
                    '}';
        }
    }

    @Data
    public static class Self {
        private String href;

        // Getters and Setters
        @Override
        public String toString() {
            return "Self{" +
                    "href='" + href + '\'' +
                    '}';
        }
    }

    @Data
    public static class PreviousEpisode {
        private String href;
        private String name;

        // Getters and Setters
        @Override
        public String toString() {
            return "PreviousEpisode{" +
                    "href='" + href + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TvShow{" +
                "show=" + show +
                '}';
    }
}
