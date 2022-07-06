package com.example.task09.controller;

import com.example.task09.advice.MyException;
import com.example.task09.service.MovieService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
  private final MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping("/movies")
  public List<MovieResponse> getNames(@RequestParam String year) {
    if (movieService.findMatch(year).stream().map(MovieResponse::new).toList()
        .isEmpty() ) {
      throw new MyException("入力に誤りがあります。年の値として2010～2019を入力してください。");
    }
    return movieService.findMatch(year).stream().map(MovieResponse::new)
        .toList();
  }
}
