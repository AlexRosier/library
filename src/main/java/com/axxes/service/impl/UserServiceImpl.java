package com.axxes.service.impl;

import com.axxes.persistence.dao.SuggestionDao;
import com.axxes.persistence.dao.UserDao;
import com.axxes.persistence.domain.Suggestion;
import com.axxes.persistence.domain.User;
import com.axxes.rest.SuggestionResource;
import com.axxes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private SuggestionDao suggestionDao;

    @Override
    public List<User> getUsersWithSuggestion() {
        return userDao.getUsersWithSuggestion();
    }

    @Override
    public void removeLastSuggestion(long userId) {
        userDao.removeLastSuggestion(userId);
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public User findUserWithFirstName(String firstName) {
        return userDao.findUserWithFirstName(firstName);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User updateUserLastName(long id, String lastName) {
        return userDao.updateUserLastName(id, lastName);
    }

    @Override
    public void createUserWithSuggestion(User user, Suggestion suggestion) {

    }

    @Override
    public void removeUser(long id) {
        userDao.removeUser(id);
    }
}