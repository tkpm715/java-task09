package com.example.task09.repositry;

import org.apache.ibatis.annotations.*;

public interface MovieMapper {
  @Mapper
  public interface PlayerMapper {
    @Select("select * from player")
    List<Movie> findAll();

    @Select("select * from player where id = #{id}")
    Movie findOne(Long id);


  }
