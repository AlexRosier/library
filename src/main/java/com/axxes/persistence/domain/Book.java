package com.axxes.persistence.domain;

import com.google.common.collect.Lists;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@NamedQueries({
        @NamedQuery(
                name = "named",
                query = "SELECT b FROM Book b"
        )}
)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private String isbn;
    @Column
    private int year;
    @Column
    private String author;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "book_id")
    private List<Tag> tags;

    public Book(long id, String title, String isbn, int year, String author, List<Tag> tags) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.author = author;
        this.tags = tags;
    }

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public static class Builder {
        private long id;
        private String title;
        private String isbn;
        private int year;
        private String author;
        private List<Tag> tags = Lists.newArrayList().

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder addTag(Tag tag) {
            tags.add(tag);
            return this;
        }

        public Book build() {
            return new Book(id, title, isbn, year, author, tags);
        }
    }
}