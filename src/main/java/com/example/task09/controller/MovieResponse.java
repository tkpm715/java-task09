package com.example.task09.controller;

import com.example.task09.entity.Movie;

public class MovieResponse {
  private String name;
  private String yearOfProduction;

  public MovieResponse(Movie movie) {
    this.name = movie.getName();
    this.yearOfProduction = movie.getYearOfProduction();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYearOfProduction(String yearOfProduction) {
    this.yearOfProduction = yearOfProduction;
  }
}

