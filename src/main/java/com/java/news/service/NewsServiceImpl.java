package com.java.news.service;

import java.util.List;

import com.java.news.dto.NewsDTO;
import com.java.news.mapper.NewsMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsMapper newsMapper;
    List<NewsDTO> newsList;
    NewsDTO newsDto;

    @Override
    public List<NewsDTO> listmap() {
        newsList = newsMapper.listmap();
        return newsList;
    }
    
}
