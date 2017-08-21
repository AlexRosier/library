package com.axxes.service.impl;

import com.axxes.persistence.dao.SuggestionDao;
import com.axxes.persistence.dao.UserDao;
import com.axxes.persistence.domain.Suggestion;
import com.axxes.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    private SuggestionDao suggestionDao;

    @Autowired
    private UserDao userDao;

    @Override
    public void createSuggestion(Suggestion suggestion, long userId) {
        //Get user
        suggestionDao.createSuggestion(suggestion);
    }

    @Override
    public List<Suggestion> getAllSuggestion(long userId) {
        return suggestionDao.getAllSuggestion(userId);
    }
}