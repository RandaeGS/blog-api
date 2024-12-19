package com.blogging.blogapi.controller;

import com.blogging.blogapi.controller.dto.ArticleDTO;
import com.blogging.blogapi.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
    @Autowired
    private ArticleService articleService;

    @GetMapping
    public ResponseEntity<?> listArticles(){
        log.info("hola");
        return articleService.listArticles();
    }

    @PostMapping
    public ResponseEntity<?> saveArticle(@RequestBody ArticleDTO articleDTO){
        return articleService.saveArticle(articleDTO);
    }
}
