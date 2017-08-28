package com.axxes.persistence.dao;

import com.axxes.persistence.domain.Suggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class SuggestionDao {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void createSuggestion(Suggestion suggestion) {
        entityManager.persist(suggestion);
    }

    public List<Suggestion> getAllSuggestion(Object p0) {
        return null;
    }
}