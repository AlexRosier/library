package com.axxes.persistence.dao;

import com.axxes.persistence.domain.LibraryUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryUserDao {

    public List<LibraryUser> getUsersWithSuggestion() {
        return null;
    }

    public void removeLastSuggestion(long userId) {

    }

    public void createUser(LibraryUser libraryUser) {

    }

    public LibraryUser findUserWithFirstName(String firstName) {
        return null;
    }

    public List<LibraryUser> getAllUsers() {
        return null;
    }

    public LibraryUser updateUserLastName(long id, String lastName) {
        return null;
    }

    public void removeUser(long id) {
    }
}