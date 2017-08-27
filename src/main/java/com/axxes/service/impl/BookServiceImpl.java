package com.axxes.service.impl;

import com.axxes.persistence.dao.BookDao;
import com.axxes.persistence.domain.Book;
import com.axxes.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllAuthors() {
        return bookDao.getAllAuthors();
    }

    @Override
    public void updateBookName(long id, String name) {
        bookDao.updateBookName(id, name);
    }

    @Override
    public Integer getNumberOfBooks() {
        return bookDao.getNumberOfBooks();
    }

    @Override
    public void updateBookTitle(long id, String title) {
        bookDao.updateBookTitle(id, title);
    }
}