package com.axxes.service.impl;

import com.axxes.persistence.dao.BookDao;
import com.axxes.persistence.dao.RentalDao;
import com.axxes.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalDao rentalDao;
}