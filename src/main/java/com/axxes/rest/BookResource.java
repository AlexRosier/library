package com.axxes.rest;

import com.axxes.persistence.domain.Book;
import com.axxes.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/updateBookName/{id}", method = RequestMethod.PUT)
    public void updateBookTitle(@PathVariable long id,
                               @RequestParam(value="title") String title) {
        bookService.updateBookTitle(id, title);
    }


    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public Integer getNumberOfBooks() {
        return bookService.getNumberOfBooks();
    }
}