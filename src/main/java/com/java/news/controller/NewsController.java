package com.java.news.controller;

import java.util.List;

import com.java.news.dto.NewsDTO;
import com.java.news.service.NewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {
    
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/list.do", method = RequestMethod.POST)
    public String listmap(Model model) {

        List<NewsDTO> listMap = newsService.listmap();
        model.addAttribute("list", listMap);
        return "listmap";
    }
}
