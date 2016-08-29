package com.axxes.service;

import com.axxes.persistence.domain.User;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
public interface UserService {
    List<User> getUsersWithSuggestion();

    void removeLastSuggestion() throws ClassNotFoundException;
}