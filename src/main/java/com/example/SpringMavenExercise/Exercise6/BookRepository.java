package com.example.SpringMavenExercise.Exercise6;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void displayBooks() {
        System.out.println("Book Repository Called");
    }
}
