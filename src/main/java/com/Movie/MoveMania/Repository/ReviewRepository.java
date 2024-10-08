package com.Movie.MoveMania.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Movie.MoveMania.MovieDocument.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
