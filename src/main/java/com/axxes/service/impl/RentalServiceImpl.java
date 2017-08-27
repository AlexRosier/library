package com.axxes.service.impl;

import com.axxes.persistence.dao.RentalDao;
import com.axxes.persistence.domain.Rental;
import com.axxes.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalDao rentalDao;

    @Override
    public List<Rental> getAllRentals() {
        return rentalDao.getAllRentals();
    }

    @Override
    public List<Rental> getRentalHistoryOfBook(String name) {
        return rentalDao.getRentalHistoryOfBook(name);
    }

    @Override
    public void createRental(long bookId, long userId) {
        rentalDao.createRental(bookId, userId, Instant.now());
    }

    @Override
    public void returnRental(long rentalId) {
        rentalDao.returnRental(rentalId, Instant.now());
    }
}