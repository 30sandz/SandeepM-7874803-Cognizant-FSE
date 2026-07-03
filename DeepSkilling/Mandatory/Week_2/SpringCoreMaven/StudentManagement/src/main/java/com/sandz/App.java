package com.sandz;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandz.Entities.Book;
import com.sandz.repository.BookRepository;
import com.sandz.service.BookService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try(ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");){
            
            BookService service = context.getBean("bookService", BookService.class);
            BookRepository repo = context.getBean("bookRepository", BookRepository.class);

            service.setBookRepository(repo);

            Book book = new Book(1, "sandz", "good");
            service.addBook(book);
            service.getAllBooks();
        }

        



        

    }
}
