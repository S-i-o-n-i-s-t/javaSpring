package com.example.demo_books.controller;

import com.example.demo_books.model.Book;
import com.example.demo_books.model.Reader;
import com.example.demo_books.repository.BookRepository;
import com.example.demo_books.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookRepository bookRepository;
    private final ReaderRepository readerRepository;
    @GetMapping
    private List<Book> getAllBook(){
        return bookRepository.findAll();
    }
    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }
    @PutMapping("/{id}")
    public Book getById(@PathVariable("id") Long id){
        return bookRepository.findById(id).orElseThrow();
    }
    @PutMapping("/{id}/reader/{readerId}")
    public ResponseEntity<Book> assignReaderToBook(@PathVariable Long id, @PathVariable Long readerid){
        Optional<Book> bookOptional = bookRepository.findById(id);
        Optional<Reader> readerOptional = readerRepository.findById(readerid);

        if (bookOptional.isPresent() && readerOptional.isPresent()){
            Book book = bookOptional.get();
            Reader reader = readerOptional.get();
            book.setReader(reader);
            bookRepository.save(book);
            return ResponseEntity.ok(book);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delteBook(@PathVariable Long id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()){
            bookRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}







