package com.movie.imdbapi.Controller;

import com.movie.imdbapi.Handler.Path;
import com.movie.imdbapi.Handler.Template;
import com.movie.imdbapi.Service.MovieService;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResultController {

    private final MovieService movieService;

    public ResultController(MovieService movieService){
        this.movieService=movieService;
    }

    @PostMapping(value = Path.RESULT)
    public String result(@RequestParam("title") final String movieTitle, final Model model){
        final var response = movieService.find(movieTitle);

        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return Template.NOT_FOUND;

        model.addAttribute("movie", movieService.find(movieTitle).getBody());
        return Template.RESULT;
    }
}
