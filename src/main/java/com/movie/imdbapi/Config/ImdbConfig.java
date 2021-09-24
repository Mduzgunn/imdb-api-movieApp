package com.movie.imdbapi.Config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com.movie.imdbapi")
public class ImdbConfig {

    private IMDB imdb = new IMDB();

    @Data
    public class IMDB{
        private String apiKey;
        private String url;
    }

}
