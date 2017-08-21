package com.axxes.persistence.dao;

import com.axxes.persistence.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 29/08/16.
 */
@Component
public class UserDao {

    public List<User> getUsersWithSuggestion() {
        return null;
    }

    public void removeLastSuggestion(long userId) {

    }

    public void createUser(User user) {

    }

    public User findUserWithFirstName(String firstName) {
        return null;
    }

    public List<User> getAllUsers() {
        return null;
    }

    public User updateUserLastName(long id, String lastName) {
        return null;
    }

    public void removeUser(long id) {
    }
}