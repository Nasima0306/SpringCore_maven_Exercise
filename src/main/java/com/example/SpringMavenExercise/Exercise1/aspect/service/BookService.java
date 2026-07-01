package com.example.SpringMavenExercise.Exercise1.aspect.service;

import com.example.SpringMavenExercise.Exercise1.aspect.repository.BookRepository;

public class BookService {
    BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void showBooks(){
        System.out.println("Book Service Called");
        bookRepository.displayBooks();
    }
}
