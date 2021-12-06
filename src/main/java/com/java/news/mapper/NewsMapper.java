package com.java.news.mapper;

import java.util.List;

import com.java.news.dto.NewsDTO;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface NewsMapper {
  public List<NewsDTO> listmap();

}