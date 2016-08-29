package com.axxes.service.impl;

import com.axxes.persistence.dao.SuggestionDao;
import com.axxes.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    private SuggestionDao suggestionDao;
}