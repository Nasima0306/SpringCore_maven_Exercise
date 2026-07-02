package com.example.SpringMavenExercise.Exercise2;


public class BookService {
    BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void showBooks() {
        System.out.println("Book Service Called");
        bookRepository.displayBooks();
    }
}
