package com.blogging.blogapi.controller.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class ArticleDTO {
    private String title;
    private String content;
    private String authorName;
    private LocalDateTime publishDate;

    public ArticleDTO() {
    }

    public ArticleDTO(String title, String content, String authorName) {
        this.title = title;
        this.content = content;
        this.authorName = authorName;
        this.publishDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }
}
