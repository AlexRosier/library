package com.axxes.service;

import com.axxes.persistence.domain.Suggestion;
import com.axxes.persistence.domain.User;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
public interface UserService {
    List<User> getUsersWithSuggestion();

    void removeLastSuggestion(long userId);

    void createUser(User user);

    User findUserWithFirstName(String firstName);

    List<User> getAllUsers();

    User updateUserLastName(long id, String lastName);

    void createUserWithSuggestion(User user, Suggestion suggestion);

    void removeUser(long id);
}