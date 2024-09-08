package com.Movie.MoveMania.MovieController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.Movie.MoveMania.MovieDocument.Movie;
import com.Movie.MoveMania.Service.MovieService;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/v1/movies")
public class ControllerMovie {
    @Autowired
    MovieService movieService;

    @GetMapping("/allmovies")
    public ResponseEntity<List<Movie>> allMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
}
