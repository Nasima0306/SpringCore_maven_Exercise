package com.example.SpringMavenExercise.Exercise6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void showBooks() {
        System.out.println("Book Service Called");
        bookRepository.displayBooks();
    }
}
