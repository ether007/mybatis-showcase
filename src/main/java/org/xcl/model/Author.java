package org.xcl.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xcl on 16/5/4.
 */
public class Author implements Serializable{

    private Long id;
    private String username;
    private String password;
    private String email;
    private String bio;
    private String favourite_section;

    private List<Blog> blogs;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFavourite_section() {
        return favourite_section;
    }

    public void setFavourite_section(String favourite_section) {
        this.favourite_section = favourite_section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Author{" +
                "bio='" + bio + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", favourite_section='" + favourite_section + '\'' +
                ", blogs=" + blogs +
                '}';
    }
}
