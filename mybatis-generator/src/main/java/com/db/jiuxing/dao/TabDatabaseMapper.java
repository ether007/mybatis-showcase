package com.db.jiuxing.dao;

import com.db.jiuxing.model.TabDatabase;
import com.db.jiuxing.model.TabDatabaseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TabDatabaseMapper {
    @SelectProvider(type=TabDatabaseSqlProvider.class, method="countByExample")
    int countByExample(TabDatabaseCriteria example);

    @DeleteProvider(type=TabDatabaseSqlProvider.class, method="deleteByExample")
    int deleteByExample(TabDatabaseCriteria example);

    @Delete({
        "delete from tab_database",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tab_database (id, name, ",
        "username, password, ",
        "ConnectionUrl, remarks, ",
        "driverclass)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{connectionurl,jdbcType=VARCHAR}, #{remarks,jdbcType=VARCHAR}, ",
        "#{driverclass,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insert(TabDatabase record);

    @InsertProvider(type=TabDatabaseSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(TabDatabase record);

    @SelectProvider(type=TabDatabaseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="ConnectionUrl", property="connectionurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="driverclass", property="driverclass", jdbcType=JdbcType.VARCHAR)
    })
    List<TabDatabase> selectByExample(TabDatabaseCriteria example);

    @Select({
        "select",
        "id, name, username, password, ConnectionUrl, remarks, driverclass",
        "from tab_database",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="ConnectionUrl", property="connectionurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="driverclass", property="driverclass", jdbcType=JdbcType.VARCHAR)
    })
    TabDatabase selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TabDatabaseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TabDatabase record, @Param("example") TabDatabaseCriteria example);

    @UpdateProvider(type=TabDatabaseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TabDatabase record, @Param("example") TabDatabaseCriteria example);

    @UpdateProvider(type=TabDatabaseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TabDatabase record);

    @Update({
        "update tab_database",
        "set name = #{name,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "ConnectionUrl = #{connectionurl,jdbcType=VARCHAR},",
          "remarks = #{remarks,jdbcType=VARCHAR},",
          "driverclass = #{driverclass,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TabDatabase record);
}