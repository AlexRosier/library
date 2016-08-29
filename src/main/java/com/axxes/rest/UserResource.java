package com.axxes.rest;

import com.axxes.persistence.domain.User;
import com.axxes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/madeSuggestion", method = RequestMethod.GET)
    public List<User> getUsersWithSuggestion() {
        return userService.getUsersWithSuggestion();
    }

    @RequestMapping(value = "/removeLastSuggestion/{id}", method = RequestMethod.DELETE)
    public void removeLastSuggestion() {
        userService.removeLastSuggestion();
    }
}