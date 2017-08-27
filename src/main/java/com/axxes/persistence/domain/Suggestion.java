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

    public Suggestion(LibraryUser libraryUser, String url, String motivation, String isbn) {
        this.libraryUser = libraryUser;
        this.url = url;
        this.motivation = motivation;
        this.isbn = isbn;
    }
}