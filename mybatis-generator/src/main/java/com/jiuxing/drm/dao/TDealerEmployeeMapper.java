package com.jiuxing.drm.dao;

import com.jiuxing.drm.model.TDealerEmployee;
import com.jiuxing.drm.model.TDealerEmployeeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDealerEmployeeMapper {
    int countByExample(TDealerEmployeeCriteria example);

    int deleteByExample(TDealerEmployeeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDealerEmployee record);

    int insertSelective(TDealerEmployee record);

    List<TDealerEmployee> selectByExample(TDealerEmployeeCriteria example);

    TDealerEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDealerEmployee record, @Param("example") TDealerEmployeeCriteria example);

    int updateByExample(@Param("record") TDealerEmployee record, @Param("example") TDealerEmployeeCriteria example);

    int updateByPrimaryKeySelective(TDealerEmployee record);

    int updateByPrimaryKey(TDealerEmployee record);
}