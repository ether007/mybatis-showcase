package com.ace.dao;

import com.ace.entity.TUser;
import com.ace.entity.TUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    int countByExample(TUserCriteria example);

    int deleteByExample(TUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserCriteria example);

    TUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}