package com.example.SpringMavenExercise;

import com.example.SpringMavenExercise.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMavenExerciseApplication {

	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service=context.getBean("bookService",BookService.class);
        service.showBooks();;
	}

}
