package org.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class TvShow {
    private Show show;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

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

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getRuntime() {
            return runtime;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }

        public int getAverageRuntime() {
            return averageRuntime;
        }

        public void setAverageRuntime(int averageRuntime) {
            this.averageRuntime = averageRuntime;
        }

        public String getPremiered() {
            return premiered;
        }

        public void setPremiered(String premiered) {
            this.premiered = premiered;
        }

        public String getEnded() {
            return ended;
        }

        public void setEnded(String ended) {
            this.ended = ended;
        }

        public String getOfficialSite() {
            return officialSite;
        }

        public void setOfficialSite(String officialSite) {
            this.officialSite = officialSite;
        }

        public Schedule getSchedule() {
            return schedule;
        }

        public void setSchedule(Schedule schedule) {
            this.schedule = schedule;
        }

        public Rating getRating() {
            return rating;
        }

        public void setRating(Rating rating) {
            this.rating = rating;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Network getNetwork() {
            return network;
        }

        public void setNetwork(Network network) {
            this.network = network;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public long getUpdated() {
            return updated;
        }

        public void setUpdated(long updated) {
            this.updated = updated;
        }

        public Links getLinks() {
            return links;
        }

        public void setLinks(Links links) {
            this.links = links;
        }

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

    public static class Schedule {
        private String time;
        private List<String> days;

        // Getters and Setters
        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public List<String> getDays() {
            return days;
        }

        public void setDays(List<String> days) {
            this.days = days;
        }

        @Override
        public String toString() {
            return "Schedule{" +
                    "time='" + time + '\'' +
                    ", days=" + days +
                    '}';
        }
    }

    public static class Rating {
        private double average;

        // Getters and Setters
        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "Rating{" +
                    "average=" + average +
                    '}';
        }
    }

    public static class Network {
        private int id;
        private String name;
        private Country country;
        private String officialSite;

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getOfficialSite() {
            return officialSite;
        }

        public void setOfficialSite(String officialSite) {
            this.officialSite = officialSite;
        }

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

    public static class Country {
        private String name;
        private String code;
        private String timezone;

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", code='" + code + '\'' +
                    ", timezone='" + timezone + '\'' +
                    '}';
        }
    }

    public static class Externals {
        private Object tvrage; // Can be null
        private int thetvdb;
        private String imdb;

        // Getters and Setters
        public Object getTvrage() {
            return tvrage;
        }

        public void setTvrage(Object tvrage) {
            this.tvrage = tvrage;
        }

        public int getThetvdb() {
            return thetvdb;
        }

        public void setThetvdb(int thetvdb) {
            this.thetvdb = thetvdb;
        }

        public String getImdb() {
            return imdb;
        }

        public void setImdb(String imdb) {
            this.imdb = imdb;
        }

        @Override
        public String toString() {
            return "Externals{" +
                    "tvrage=" + tvrage +
                    ", thetvdb=" + thetvdb +
                    ", imdb='" + imdb + '\'' +
                    '}';
        }
    }

    public static class Image {
        private String medium;
        private String original;

        // Getters and Setters
        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

        @Override
        public String toString() {
            return "Image{" +
                    "medium='" + medium + '\'' +
                    ", original='" + original + '\'' +
                    '}';
        }
    }

    public static class Links {
        private Self self;
        private PreviousEpisode previousepisode;

        // Getters and Setters
        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public PreviousEpisode getPreviousepisode() {
            return previousepisode;
        }

        public void setPreviousEpisode(PreviousEpisode previousepisode) {
            this.previousepisode = previousepisode;
        }

        @Override
        public String toString() {
            return "Links{" +
                    "self=" + self +
                    ", previousepisode=" + previousepisode +
                    '}';
        }
    }

    public static class Self {
        private String href;

        // Getters and Setters
        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        @Override
        public String toString() {
            return "Self{" +
                    "href='" + href + '\'' +
                    '}';
        }
    }

    public static class PreviousEpisode {
        private String href;
        private String name;

        // Getters and Setters
        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

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
