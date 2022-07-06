package com.example.task09.service;

import com.example.task09.entity.Movie;
import java.util.List;

public interface MovieService {
  public List<Movie> findMatch(String yearOfProduction);
}
