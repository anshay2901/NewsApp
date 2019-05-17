package com.example.newsapp.models;

import java.net.URL;
import java.util.List;

public class Article {

    private List<Source> src;
    private String author;
    private String title;
    private String description;
    private URL url;
    private URL urlToImage;
    private String publishedAt;
    private String content;

    public Article() {

    }

    public Article(List<Source> src, String author, String title, String description, URL url, URL urlToImage, String publishedAt, String content) {
        this.src = src;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    public List<Source> getSrc() {
        return src;
    }

    public void setSrc(List<Source> src) {
        this.src = src;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public URL getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(URL urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
