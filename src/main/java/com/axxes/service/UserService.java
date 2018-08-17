package com.axxes.service;

import com.axxes.persistence.domain.Suggestion;
import com.axxes.persistence.domain.LibaryUser;

import java.util.List;

public interface UserService {
    List<LibaryUser> getUsersWithSuggestion();

    void removeLastSuggestion(long userId);

    void createUser(LibaryUser libraryUser);

    LibaryUser findUserWithFirstName(String firstName);

    List<LibaryUser> getAllUsers();

    LibaryUser updateUserLastName(long id, String lastName);

    void createUserWithSuggestion(LibaryUser libraryUser, Suggestion suggestion);

    void removeUser(long id);
}