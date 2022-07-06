package com.example.task09.model;

public class Movie {
  private String name;
  private String yearOfCreation;

  public Movie(String name, String yearOfCreation) {
    this.name = name;
    this.yearOfCreation = yearOfCreation;
  }

  public String getName() {
    return name;
  }
  public String getYearOfCreation() {
    return yearOfCreation;
  }
}
