package org.xcl.dao;

import org.xcl.model.Blog;

import java.util.List;

/**
 * Created by xcl on 16/5/5.
 */
public interface BlogDao {

    Long save(Blog blog);

    Blog select(Long id);

    Blog selectBlog(Long id);

    List<Blog> blogs();
}
