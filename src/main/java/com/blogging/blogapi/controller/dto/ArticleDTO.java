package com.blogging.blogapi.controller.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleDTO {
    private String title;
    private String content;
    private String authorName;
    private Date publishDate;
}
