package com.example.SpringMavenExercise.Exercise3;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        System.out.println("Book Service Called");
        bookRepository.displayBooks();
    }
}
