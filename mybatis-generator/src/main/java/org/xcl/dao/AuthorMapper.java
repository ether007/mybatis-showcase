package org.xcl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xcl.model.Author;
import org.xcl.model.AuthorCriteria;

public interface AuthorMapper {
    int countByExample(AuthorCriteria example);

    int deleteByExample(AuthorCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorCriteria example);

    Author selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Author record, @Param("example") AuthorCriteria example);

    int updateByExample(@Param("record") Author record, @Param("example") AuthorCriteria example);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}