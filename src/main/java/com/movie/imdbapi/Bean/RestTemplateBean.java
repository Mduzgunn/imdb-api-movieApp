package com.movie.imdbapi.Bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//synchronous
@Configuration
public class RestTemplateBean {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
