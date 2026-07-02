package com.example.SpringMavenExercise.Exercise5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementSytsem {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ex5.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.showBooks();
    }
}
