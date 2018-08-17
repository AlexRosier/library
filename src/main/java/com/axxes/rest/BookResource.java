package com.axxes.rest;

import com.axxes.persistence.domain.Book;
import com.axxes.service.BookService;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping("/book")
public class BookResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookResource.class);

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Book> getBooks() {
        LOGGER.info("received get all books request");
        return Lists.newArrayList(bookService.findAll());
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Book> getAllAuthors() {
        return bookService.getAllAuthors();
    }

    @RequestMapping(value = "/updateBookName/{id}", method = RequestMethod.PUT)
    public void updateBookName(@PathVariable long id,
                               @RequestParam(value="name") String name) {
        bookService.updateBookName(id, name);
    }

    @RequestMapping(value = "/updateBookTitle/{id}", method = RequestMethod.PUT)
    public void updateBookTitle(@PathVariable long id,
                               @RequestParam(value="title") String title) {
        bookService.updateBookTitle(id, title);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public Integer getNumberOfBooks() {
        return bookService.getNumberOfBooks();
    }
}