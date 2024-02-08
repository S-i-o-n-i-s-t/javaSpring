package com.example.demo_books.service;

import com.example.demo_books.domain.Book;
import com.example.demo_books.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor// требование конструктора с необходимыми полями для bookRepository
public class BookService {
    private BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }

}
