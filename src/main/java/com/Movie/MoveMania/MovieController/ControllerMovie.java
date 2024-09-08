package com.Movie.MoveMania.MovieController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/v1/movies")
public class ControllerMovie {
    @GetMapping("/allmovies")
    public String allMovies() {
        return "All movies";
    }
}
