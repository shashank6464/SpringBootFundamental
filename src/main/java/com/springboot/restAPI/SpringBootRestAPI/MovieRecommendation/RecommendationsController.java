package com.springboot.restAPI.SpringBootRestAPI.MovieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import java.util.Arrays;

@RestController
public class RecommendationsController {
    @GetMapping("/movies")

    public List<Movie> getAllMovies()
    {
       return Arrays.asList(new Movie(1, "Spiderman" ,9.2),
               new Movie(2,"Superman",9.5),
               new Movie(3,"Harry Potter",9.4),
               new Movie(4,"Iron Man",9.8)
       );

    }

}
