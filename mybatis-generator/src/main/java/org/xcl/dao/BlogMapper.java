package org.xcl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xcl.model.Blog;
import org.xcl.model.BlogCriteria;

public interface BlogMapper {
    int countByExample(BlogCriteria example);

    int deleteByExample(BlogCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogCriteria example);

    Blog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogCriteria example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogCriteria example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
}