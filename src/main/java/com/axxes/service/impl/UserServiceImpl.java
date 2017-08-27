package com.axxes.service.impl;

import com.axxes.persistence.dao.SuggestionDao;
import com.axxes.persistence.dao.LibraryUserDao;
import com.axxes.persistence.domain.Suggestion;
import com.axxes.persistence.domain.LibraryUser;
import com.axxes.service.UserService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private LibraryUserDao libraryUserDao;

    @Autowired
    private SuggestionDao suggestionDao;

    @Override
    public List<LibraryUser> getUsersWithSuggestion() {
        return libraryUserDao.getUsersWithSuggestion();
    }

    @Override
    public void removeLastSuggestion(long userId) {
        libraryUserDao.removeLastSuggestion(userId);
    }

    @Override
    public void createUser(LibraryUser libraryUser) {
        libraryUserDao.createUser(libraryUser);
    }

    @Override
    public LibraryUser findUserWithFirstName(String firstName) {
        return libraryUserDao.findUserWithFirstName(firstName);
    }

    @Override
    public List<LibraryUser> getAllUsers() {
        try {
            return libraryUserDao.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Lists.newArrayListWithCapacity(0);
    }

    @Override
    public LibraryUser updateUserLastName(long id, String lastName) {
        return libraryUserDao.updateUserLastName(id, lastName);
    }

    @Override
    public void createUserWithSuggestion(LibraryUser libraryUser, Suggestion suggestion) {

    }

    @Override
    public void removeUser(long id) {
        libraryUserDao.removeUser(id);
    }
}