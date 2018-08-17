package com.axxes.repository;

import com.axxes.persistence.domain.Book;

/**
 * Created by dhonorez on 29/08/16.
 */
public interface BookRepositoryCustom {

    Book findBySomeId(Long id);

}
