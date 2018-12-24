package com.zking.ssm.model;

public class Category_news {
    private Category category;
    private News news;


    public Category_news(Category category, News news) {
        this.category = category;
        this.news = news;
    }

    public Category_news() {
        super();
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
