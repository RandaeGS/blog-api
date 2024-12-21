package com.blogging.blogapi.controller;

import com.blogging.blogapi.controller.dto.ArticleDTO;
import com.blogging.blogapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public ResponseEntity<?> listArticles(){
        return articleService.listArticles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getArticle(@PathVariable("id") Long articleId){
        return articleService.getArticle(articleId);
    }

    @PostMapping
    public ResponseEntity<?> saveArticle(@RequestBody ArticleDTO articleDTO){
        return articleService.saveArticle(articleDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteArticle(@PathVariable("id") Long articleId){
        return articleService.deleteArticle(articleId);
    }
}
