package com.axxes.service;

import com.axxes.persistence.domain.Suggestion;
import com.axxes.persistence.domain.LibraryUser;

import java.util.List;

public interface UserService {
    List<LibraryUser> getUsersWithSuggestion();

    void removeLastSuggestion(long userId);

    void createUser(LibraryUser libraryUser);

    LibraryUser findUserWithFirstName(String firstName);

    List<LibraryUser> getAllUsers();

    LibraryUser updateUserLastName(long id, String lastName);

    void createUserWithSuggestion(LibraryUser libraryUser, Suggestion suggestion);

    void removeUser(long id);
}