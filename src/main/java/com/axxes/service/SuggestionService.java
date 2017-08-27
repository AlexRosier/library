package com.axxes.service;

import com.axxes.persistence.domain.Suggestion;

import java.util.List;

public interface SuggestionService {
    void createSuggestion(Suggestion suggestion, long userId);

    List<Suggestion> getAllSuggestion(long userId);
}