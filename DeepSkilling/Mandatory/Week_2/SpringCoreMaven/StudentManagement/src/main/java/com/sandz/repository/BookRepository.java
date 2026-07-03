package com.sandz.repository;

import java.util.ArrayList;
import java.util.List;

import com.sandz.Entities.Book;

public class BookRepository {

    

    private List<Book> bookList = new ArrayList<>();


    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getAllBooks(){
        return bookList;
    }



    
}
