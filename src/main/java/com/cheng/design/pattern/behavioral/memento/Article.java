package com.cheng.design.pattern.behavioral.memento;

/**
 * @author cheng
 *         2018/11/14 11:22
 */
public class Article {

    private String title;
    private String content;
    private String img;

    public Article(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public ArticleMemento saveToMemento() {
        return new ArticleMemento(this.title, this.content, this.img);
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.img = articleMemento.getImg();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
