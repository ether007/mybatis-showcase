package com.db.jiuxing.dao;

import com.db.jiuxing.model.TabTables;
import com.db.jiuxing.model.TabTablesCriteria;
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

public interface TabTablesMapper {
    @SelectProvider(type=TabTablesSqlProvider.class, method="countByExample")
    int countByExample(TabTablesCriteria example);

    @DeleteProvider(type=TabTablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TabTablesCriteria example);

    @Delete({
        "delete from tab_tables",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tab_tables (id, dbId, ",
        "name, remarks, iorder)",
        "values (#{id,jdbcType=INTEGER}, #{dbid,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{remarks,jdbcType=VARCHAR}, #{iorder,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insert(TabTables record);

    @InsertProvider(type=TabTablesSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insertSelective(TabTables record);

    @SelectProvider(type=TabTablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dbId", property="dbid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="iorder", property="iorder", jdbcType=JdbcType.INTEGER)
    })
    List<TabTables> selectByExample(TabTablesCriteria example);

    @Select({
        "select",
        "id, dbId, name, remarks, iorder",
        "from tab_tables",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dbId", property="dbid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="iorder", property="iorder", jdbcType=JdbcType.INTEGER)
    })
    TabTables selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TabTablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TabTables record, @Param("example") TabTablesCriteria example);

    @UpdateProvider(type=TabTablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TabTables record, @Param("example") TabTablesCriteria example);

    @UpdateProvider(type=TabTablesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TabTables record);

    @Update({
        "update tab_tables",
        "set dbId = #{dbid,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "remarks = #{remarks,jdbcType=VARCHAR},",
          "iorder = #{iorder,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TabTables record);
}