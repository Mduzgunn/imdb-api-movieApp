package com.movie.imdbapi.Service;

import com.movie.imdbapi.Model.Result;
import com.movie.imdbapi.Util.UrlGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    private final UrlGenerator urlGenerator;
    private final RestTemplate restTemplate;

    public MovieService(UrlGenerator urlGenerator, RestTemplate restTemplate) {
        this.urlGenerator = urlGenerator;
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<Result> find(final String movieTitle){
        final var response = restTemplate.getForEntity(urlGenerator.generator(movieTitle), Result.class);
        final var Result = response.getBody();

        return ResponseEntity.ok(Result);
    }


}
