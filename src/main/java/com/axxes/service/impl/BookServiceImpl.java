package com.axxes.service.impl;

import com.axxes.persistence.dao.BookDao;
import com.axxes.persistence.domain.Book;
import com.axxes.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllAuthors() {
        return null;
    }

    @Override
    public void updateBookName(long id, String name) {
    }

    @Override
    public Integer getNumberOfBooks() {
        return null;
    }
}