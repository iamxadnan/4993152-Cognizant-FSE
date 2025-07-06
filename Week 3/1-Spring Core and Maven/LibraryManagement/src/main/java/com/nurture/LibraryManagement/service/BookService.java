package com.nurture.LibraryManagement.service;

import com.nurture.LibraryManagement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String name) {
        bookRepository.saveBook(name);
        System.out.println("Book added: " + name);
    }
}
