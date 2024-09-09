package com.Movie.MoveMania.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.core.query.UpdateDefinition;
import org.springframework.stereotype.Service;

import com.Movie.MoveMania.MovieDocument.Movie;
import com.Movie.MoveMania.MovieDocument.Review;
import com.Movie.MoveMania.Repository.ReviewRepository;
import com.mongodb.annotations.Sealed;

@SuppressWarnings("unused")
@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review.getId()))
                .first();
        return review;
    }
}
