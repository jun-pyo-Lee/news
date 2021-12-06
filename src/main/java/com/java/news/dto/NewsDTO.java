package com.java.news.dto;

public class NewsDTO {
    private int newsNo;
    private String newsTitle;
    private String newsContents;
    private String newsFile;

    public int getNewsNo() {
        return newsNo;
    }
    public void setNewsNo(int newsNo) {
        this.newsNo = newsNo;
    }
    public String getNewsTitle() {
        return newsTitle;
    }
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
    public String getNewsContents() {
        return newsContents;
    }
    public void setNewsContents(String newsContents) {
        this.newsContents = newsContents;
    }
    public String getNewsFile() {
        return newsFile;
    }
    public void setNewsFile(String newsFile) {
        this.newsFile = newsFile;
    }
    
}
