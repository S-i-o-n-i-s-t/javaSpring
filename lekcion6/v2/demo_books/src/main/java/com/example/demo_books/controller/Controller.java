package com.example.demo_books.controller;

import com.example.demo_books.domain.Book;
import com.example.demo_books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class Controller {
    private final BookService bookService;
    @GetMapping
    public List<Book> grtBook(){
        return bookService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        Optional<Book> book = bookService.findById(id);
        return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public Book save(Book book){
        return bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    public Book update(@RequestBody Book book, @PathVariable Long id){
        book.setId(id);
        return bookService.saveBook(book);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.deleteById(id);
    }
}
