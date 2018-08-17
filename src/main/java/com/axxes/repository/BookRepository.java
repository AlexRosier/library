package com.axxes.repository;

import com.axxes.persistence.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dhonorez on 29/08/16.
 */
public interface BookRepository extends CrudRepository<Book, Long>, BookRepositoryCustom {
}
