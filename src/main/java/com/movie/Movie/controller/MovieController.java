package com.movie.Movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Movie;
import com.movie.respository.MovieRepository;

@RestController
@RequestMapping("/api/v1/")
public class MovieController {
  @Autowired
  private MovieRepository movieRepository;

  // get all movies
  @GetMapping("movies")
  public List<Movie> getAllMovies() {
    return movieRepository.findAll();
  }
}
