package com.axxes.persistence.domain;

import javax.persistence.*;

@Entity
@Table
public class Suggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "libraryuser_id")
    private LibraryUser libraryUser;
    @Column
    private String url;
    @Column
    private String motivation;
    @Column
    private String isbn;

    public Suggestion(long id, LibraryUser libraryUser, String url, String motivation, String isbn) {
        this.id = id;
        this.libraryUser = libraryUser;
        this.url = url;
        this.motivation = motivation;
        this.isbn = isbn;
    }

    public Suggestion() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LibraryUser getLibraryUser() {
        return libraryUser;
    }

    public void setLibraryUser(LibraryUser libraryUser) {
        this.libraryUser = libraryUser;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static class Builder {

        private long id;
        private LibraryUser libraryUser;
        private String url;
        private String motivation;
        private String isbn;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setLibraryUser(LibraryUser libraryUser) {
            this.libraryUser = libraryUser;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setMotivation(String motivation) {
            this.motivation = motivation;
            return this;
        }

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }


        public Suggestion build() {
            return new Suggestion(id, libraryUser, url, motivation, isbn);
        }
    }
}