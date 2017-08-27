package com.axxes.service;

import com.axxes.persistence.domain.Book;

import java.util.List;

public interface BookService {
    List<String> getAllAuthors();

    void updateBookName(long id, String name);

    Integer getNumberOfBooks();

    void updateBookTitle(long id, String title);
}