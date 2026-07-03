package com.example.Library;

import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
    @RequestMapping("/books")
    public class BookController {

        private final BookRepository repository;

        public BookController(BookRepository repository) {
            this.repository = repository;
        }

        @GetMapping
        public List<Entity> getBooks() {
            return repository.findAll();
        }

        @PostMapping
        public  Entity addBook(@RequestBody Entity entity) {
            return repository.save(entity);
        }
}

