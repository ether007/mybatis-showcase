package org.xcl.model;

import java.io.Serializable;

/**
 * Created by xcl on 16/5/4.
 */
public class Blog implements Serializable{

    private Long id;
    private String title;
    private Long author_id;

    private Author author;

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", author=" + author +
                ", author_id=" + author_id +
                ", title='" + title + '\'' +
                '}';
    }
}
