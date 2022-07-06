package com.example.task09.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class MovieService {
  @Autowired
  private MovierMapper movierMapper;

  public List<Movie> findAll() {
    return movieMapper.findAll();
  }

  public Movie findOne(Long id) {
    return movieMapper.findOne(id);
  }
}
