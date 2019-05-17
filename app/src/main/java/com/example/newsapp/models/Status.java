package com.example.newsapp.models;

import java.lang.reflect.Array;
import java.util.List;

public class Status {
    private String status;
    private int totalResults;
    private List<Article> arc;

    public Status() {

    }

    public Status(String status, int totalResults, List<Article> arc) {
        this.status = status;
        this.totalResults = totalResults;
        this.arc = arc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<Article> getArc() {
        return arc;
    }

    public void setArc(List<Article> arc) {
        this.arc = arc;
    }
}
