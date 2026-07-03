package com.sandz.service;

import java.util.List;


import com.sandz.Entities.Book;
import com.sandz.repository.BookRepository;

public class BookService  {

    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository; 
    }

    public void addBook(Book book){
        bookRepository.addBook(book);
    }

    public void getAllBooks(){
        List<Book> bookList = bookRepository.getAllBooks();

        for(Book b: bookList){
            System.out.println("Book Id "+b.getId()+" Book Name "+b.getTitle()+" Book description: "+b.getDescription());
        }
    }
    
}
