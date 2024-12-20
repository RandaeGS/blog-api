package com.blogging.blogapi.service;

import com.blogging.blogapi.controller.dto.ArticleDTO;
import com.blogging.blogapi.domain.entity.Article;
import com.blogging.blogapi.domain.repository.ArticleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public ResponseEntity<?> listArticles(){
        List<Article> articleList = articleRepository.findAll();
        return new ResponseEntity<>(articleList,HttpStatus.OK);
    }

    public ResponseEntity<?> getArticle(Long id){
        Optional<Article> articleOptional = articleRepository.findById(id);
        if (articleOptional.isEmpty()) {
            return new ResponseEntity<>("Article not found", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(articleOptional.get(), HttpStatus.FOUND);
    }

    @Transactional
    public ResponseEntity<?> saveArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setTitle(articleDTO.getTitle());
        article.setContent(articleDTO.getContent());
        article.setAuthorName(articleDTO.getAuthorName());
        article.setPublishDate(articleDTO.getPublishDate());
        articleRepository.save(article);
        return new ResponseEntity<>("Article sucessfully created!", HttpStatus.CREATED);
    }
}
