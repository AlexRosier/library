package com.axxes.persistence.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Book book;
    @OneToOne
    @JoinColumn(name = "libraryuser_id")
    private LibaryUser user;
    @Column(name = "pickup_date")
    private Date pickupDate;
    @Column(name = "return_date")
    private Date returnDate;

    public Rental(long id, Book book, LibaryUser user, Date pickupDate, Date returnDate) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
    }

    public Rental() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LibaryUser getUser() {
        return user;
    }

    public void setUser(LibaryUser user) {
        this.user = user;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public static class Builder {
        private long id;
        private Book book;
        private LibaryUser libraryUser;
        private Date pickupDate;
        private Date returnDate;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setLibraryUser(LibaryUser libraryUser) {
            this.libraryUser = libraryUser;
            return this;
        }

        public Builder setPickupDate(Date pickupDate) {
            this.pickupDate = pickupDate;
            return this;
        }

        public Builder setReturnDate(Date returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder setBook(Book book) {
            this.book = book;
            return this;
        }

        public Rental build() {
            return new Rental(id, book, libraryUser, pickupDate, returnDate);
        }
    }
}