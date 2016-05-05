package org.xcl.dao;

import org.xcl.model.Author;

import java.util.List;

/**
 * Created by xcl on 16/5/5.
 */
public interface AuthorDao {

    long save(Author author);

    long update(Author author);

    long dupdate(Author author);

    int delete(Long id);

    Author findById(Long id);

    List<Author> findAll();

    List<Author> authors();

    List<Author> dselect(Author author);

    List<Author> selectAuthorIn(List<Long> list);

    List<Author> selectAuthorOr(List<Long> list);
}
