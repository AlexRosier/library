package com.axxes.service;

import com.axxes.persistence.domain.Rental;

import java.util.List;

public interface RentalService {

    List<Rental> getAllRentals();

    List<Rental> getRentalHistoryOfBook(String name);

    void createRental(long bookId, long userId);

    void returnRental(long rentalId);
}