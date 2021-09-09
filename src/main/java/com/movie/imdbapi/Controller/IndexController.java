package com.movie.imdbapi.Controller;

import com.movie.imdbapi.Handler.Path;
import com.movie.imdbapi.Handler.Template;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping(value = {Path.INDEX, "/" })
    public String indexHandler(){
        return Template.INDEX;
    }
}
