package com.example.SpringMavenExercise;

import com.example.SpringMavenExercise.Exercise2.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMavenExerciseApplication {

	public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ex2.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.showBooks();
	}

}
