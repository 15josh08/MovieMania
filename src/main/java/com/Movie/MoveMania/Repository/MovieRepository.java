package com.Movie.MoveMania.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Movie.MoveMania.MovieDocument.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
