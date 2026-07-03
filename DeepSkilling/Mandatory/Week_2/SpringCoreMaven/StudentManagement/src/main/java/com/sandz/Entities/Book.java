package com.sandz.Entities;

public class Book {
    
    private int id;
    private String title;
    private String description;

    public Book(int id, String title, String description){
        this.id = id;
        this.title =title;
        this.description = description;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
}
