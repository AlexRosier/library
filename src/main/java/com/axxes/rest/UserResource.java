package com.axxes.rest;

import com.axxes.persistence.domain.Suggestion;
import com.axxes.persistence.domain.User;
import com.axxes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import java.util.List;
import java.util.Random;

/**
 * Created by Alex on 26/08/16.
 */
@Component
@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/madeSuggestion", method = RequestMethod.GET)
    public List<User> getUsersWithSuggestion() {
        return userService.getUsersWithSuggestion();
    }

    @RequestMapping(value = "/removeLastSuggestion/{userId}", method = RequestMethod.DELETE)
    public void removeLastSuggestion(@PathVariable long userId) {
        userService.removeLastSuggestion(userId);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createUser(@RequestParam(value="userName") String userName,
                           @RequestParam(value="firstName") String firstName,
                           @RequestParam(value="lastName") String lastName,
                           @RequestParam(value="email") String email) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setUserName(userName);
        userService.createUser(user);
    }

    @RequestMapping(value = "/createUserWithSuggestion", method = RequestMethod.POST)
    public void createUserWithSuggestion(@RequestParam(value="userName") String userName,
                           @RequestParam(value="firstName") String firstName,
                           @RequestParam(value="lastName") String lastName,
                           @RequestParam(value="email") String email) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setUserName(userName);
        Suggestion suggestion = new Suggestion();
        suggestion.setUrl("http://www.google.be");
        suggestion.setMotivation("motivation");
        suggestion.setIsbn("1234-1234");
        userService.createUserWithSuggestion(user, suggestion);
    }

    @RequestMapping(value = "/searchUser/{firstName}", method = RequestMethod.GET)
    public User findUserWithFirstName(@PathVariable String firstName) {
        return userService.findUserWithFirstName(firstName);
    }

    @RequestMapping(value = "/updateUserLastName/{id}", method = RequestMethod.PUT)
    public User updateUserLastName(@PathVariable long id,
                                   @RequestParam(value="lastName") String lastName) {
        return userService.updateUserLastName(id, lastName);
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public void removeUser(@PathVariable long id) {
        userService.removeUser(id);
    }
}