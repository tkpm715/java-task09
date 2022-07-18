package com.example.task09.service;

import com.example.task09.entity.Movie;
import com.example.task09.mapper.MovieMapper;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MovieServiceImpl implements MovieService {
  private final MovieMapper movieMapper;
  
  public MovieServiceImpl(MovieMapper movieMapper) {
    this.movieMapper = movieMapper;
  }
  @Transactional
  public List<Movie> findMovieMatching(String yearOfProduction) {
    return movieMapper.findMovieMatching(yearOfProduction);
  }
}
