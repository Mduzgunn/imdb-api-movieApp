package com.movie.imdbapi.Service;

import com.movie.imdbapi.Model.Data;
import com.movie.imdbapi.Util.UrlGenerator;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class MovieService {

    private final UrlGenerator urlGenerator;
    private final RestTemplate restTemplate;


    public ResponseEntity<Data> find(final String movieTitle){
        final var response = restTemplate.getForEntity(urlGenerator.generator(movieTitle), Data.class);
        final var Data = response.getBody();

        return ResponseEntity.ok(Data);
    }


}
