package com.db.jiuxing.dao;

import com.db.jiuxing.model.TabColumn;
import com.db.jiuxing.model.TabColumnCriteria;
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

public interface TabColumnMapper {
    @SelectProvider(type=TabColumnSqlProvider.class, method="countByExample")
    int countByExample(TabColumnCriteria example);

    @DeleteProvider(type=TabColumnSqlProvider.class, method="deleteByExample")
    int deleteByExample(TabColumnCriteria example);

    @Delete({
        "delete from tab_column",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tab_column (id, tabId, ",
        "name, type_name, ",
        "column_size, remarks)",
        "values (#{id,jdbcType=INTEGER}, #{tabid,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{typeName,jdbcType=VARCHAR}, ",
        "#{columnSize,jdbcType=INTEGER}, #{remarks,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insert(TabColumn record);

    @InsertProvider(type=TabColumnSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(TabColumn record);

    @SelectProvider(type=TabColumnSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="tabId", property="tabid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_size", property="columnSize", jdbcType=JdbcType.INTEGER),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<TabColumn> selectByExample(TabColumnCriteria example);

    @Select({
        "select",
        "id, tabId, name, type_name, column_size, remarks",
        "from tab_column",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="tabId", property="tabid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_size", property="columnSize", jdbcType=JdbcType.INTEGER),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    TabColumn selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TabColumnSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TabColumn record, @Param("example") TabColumnCriteria example);

    @UpdateProvider(type=TabColumnSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TabColumn record, @Param("example") TabColumnCriteria example);

    @UpdateProvider(type=TabColumnSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TabColumn record);

    @Update({
        "update tab_column",
        "set tabId = #{tabid,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "type_name = #{typeName,jdbcType=VARCHAR},",
          "column_size = #{columnSize,jdbcType=INTEGER},",
          "remarks = #{remarks,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TabColumn record);
}