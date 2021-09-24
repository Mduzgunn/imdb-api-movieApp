package com.movie.imdbapi.Util;

import com.movie.imdbapi.Config.ImdbConfig;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
@EnableConfigurationProperties(value = ImdbConfig.class)
public class UrlGenerator {

    private final ImdbConfig imdbConfig;

    public String generator(final String movieTitle){
        final var properties =imdbConfig.getImdb();
        return properties.getUrl().replace("{apiKey}", properties.getApiKey()).replace("{title}", movieTitle).trim();
    }

}
