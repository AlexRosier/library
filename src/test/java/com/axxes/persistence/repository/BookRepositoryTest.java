package com.axxes.persistence.repository;

import com.axxes.persistence.domain.Book;
import com.axxes.repository.BookRepository;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by dhonorez on 29/08/16.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@DatabaseSetup(BookRepositoryTest.DATASET)
@TestExecutionListeners(mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS, value = {DbUnitTestExecutionListener.class})
public class BookRepositoryTest {

    protected static final String DATASET = "classpath:datasets/books.xml";

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void repoTest() {
        assertThat(bookRepository.findOne(1L)).isNotNull();
    }

    @Test
    public void customTest() {
        assertThat(bookRepository.findBySomeId(1L)).isNotNull();
    }

    @Test
    public void testSave() {
        Book book = new Book();
        book.setTitle("Spring Data for Axxes n00bz");
        book.setAuthor("Dylan Honorez");
        book.setYear(2016);

        book = bookRepository.save(book);

        assertThat(book.getId()).isNotNull();
    }

    @Test
    public void testFindAll() {
        assertThat(bookRepository.findAll()).hasSize(1);
    }

}