package com.example.SpringMavenExercise.Exercise7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagement {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ex7.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.showBooks();
    }
}
