package com.Movie.MoveMania.Service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movie.MoveMania.MovieDocument.Movie;
import com.Movie.MoveMania.Repository.MovieRepository;
import com.mongodb.annotations.Sealed;

@SuppressWarnings("unused")
@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(ObjectId id) {
        return movieRepository.findById(id);
    }

}
