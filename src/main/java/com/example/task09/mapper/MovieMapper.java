package com.example.task09.mapper;

import com.example.task09.entity.Movie;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MovieMapper {
    @Select("select * from movie where year_of_production=#{yearOfProduction}")
    List<Movie> findMovieMatching(String yearOfProduction);
  }

