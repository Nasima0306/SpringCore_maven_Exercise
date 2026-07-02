package com.example.SpringMavenExercise.Exercise6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LibraryManagnement {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ex6.xml");

        BookService service =
                context.getBean(BookService.class);

        service.showBooks();
    }
}

