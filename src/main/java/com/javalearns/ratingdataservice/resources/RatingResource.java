package com.javalearns.ratingdataservice.resources;

import com.javalearns.ratingdataservice.model.Rating;
import com.javalearns.ratingdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4.5);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Rating> ratingList = Arrays.asList(
                new Rating("1234", 5),
                new Rating("2424", 3.4)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRatings(ratingList);
        return userRating;
    }
}
