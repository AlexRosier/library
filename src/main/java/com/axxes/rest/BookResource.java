package com.axxes.rest;

import com.axxes.persistence.domain.Book;
import com.axxes.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
@RestController
@RequestMapping("/book")
public class BookResource {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Book> getAllAuthors() {
        return bookService.getAllAuthors();
    }

    @RequestMapping(value = "/updateBookName/{id}", method = RequestMethod.PUT)
    public void updateBookName(@PathVariable long id,
                               @RequestParam(value="name") String name) {
        bookService.updateBookName(id, name);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public Integer getNumberOfBooks() {
        return bookService.getNumberOfBooks();
    }
}