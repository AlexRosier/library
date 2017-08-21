package com.axxes.persistence.dao;

import com.axxes.persistence.domain.Rental;
import com.axxes.persistence.domain.User;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

/**
 * Created by Alex on 29/08/16.
 */
@Component
public class RentalDao {

    public List<Rental> getAllRentals() {
        return null;
    }

    public List<Rental> getRentalHistoryOfBook(String name) {
        return null;
    }

    public void createRental(long bookId, long userId, Instant now) {

    }


    public void returnRental(long rentalId, Instant now) {

    }
}