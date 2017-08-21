package com.axxes.service;

import com.axxes.persistence.domain.Suggestion;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
public interface SuggestionService {
    void createSuggestion(Suggestion suggestion, long userId);

    List<Suggestion> getAllSuggestion(long userId);
}