package com.axxes.persistence.dao;

import com.axxes.persistence.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllAuthors() {
        return jdbcTemplate.query("SELECT author FROM book", new Object[0], new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString("author");
            }
        });
    }

    public void updateBookName(long id, String name) {
    }

    public Integer getNumberOfBooks() {
        return jdbcTemplate.queryForObject("SELECT count(1) FROM book", new Object[0], Integer.class);
    }

    public void updateBookTitle(long id, String title) {
        jdbcTemplate.update("UPDATE book SET title = ? WHERE id = ?", title, id);
    }
}