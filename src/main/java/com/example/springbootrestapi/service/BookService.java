package com.example.springbootrestapi.service;

import com.example.springbootrestapi.entity.Book;
import com.example.springbootrestapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for Book management. This class handle the logic for CRUD operations on Book entity.
 */
@Service
public class BookService {

    @Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    // Create or Update a Book
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Read: Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Read: Get a specific book
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // Delete a book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
