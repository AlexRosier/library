package com.axxes.service;

import com.axxes.persistence.domain.Rental;
import com.axxes.persistence.domain.User;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
public interface RentalService {

    List<Rental> getAllRentals();

    List<Rental> getRentalHistoryOfBook(String name);

    void createRental(long bookId, long userId);

    void returnRental(long rentalId);
}