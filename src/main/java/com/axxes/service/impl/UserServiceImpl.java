package com.axxes.service.impl;

import com.axxes.persistence.dao.UserDao;
import com.axxes.persistence.domain.User;
import com.axxes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsersWithSuggestion() {
        return null;
    }

    @Override
    public void removeLastSuggestion() {
    }
}