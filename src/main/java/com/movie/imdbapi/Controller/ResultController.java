package com.movie.imdbapi.Controller;

import com.movie.imdbapi.Handler.Path;
import com.movie.imdbapi.Handler.Template;
import com.movie.imdbapi.Service.MovieService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class ResultController {

    private final MovieService movieService;

    @PostMapping(value = Path.RESULT)
    public String result(@RequestParam("expression") final String movieTitle, final Model model){
        final var response = movieService.find(movieTitle);

        model.addAttribute("movie", movieService.find(movieTitle).getBody());
        return Template.RESULT;
    }
}
