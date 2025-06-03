package com.arsh.bookApp.service;

import com.arsh.bookApp.model.Book;
import com.arsh.bookApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void  addBook(Book book) {
        bookRepository.save(book);
    }
}
