package com.jiuxing.drm.dao;

import com.jiuxing.drm.model.VehicleOrderAdTmp;
import com.jiuxing.drm.model.VehicleOrderAdTmpCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleOrderAdTmpMapper {
    int countByExample(VehicleOrderAdTmpCriteria example);

    int deleteByExample(VehicleOrderAdTmpCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleOrderAdTmp record);

    int insertSelective(VehicleOrderAdTmp record);

    List<VehicleOrderAdTmp> selectByExampleWithBLOBs(VehicleOrderAdTmpCriteria example);

    List<VehicleOrderAdTmp> selectByExample(VehicleOrderAdTmpCriteria example);

    VehicleOrderAdTmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleOrderAdTmp record, @Param("example") VehicleOrderAdTmpCriteria example);

    int updateByExampleWithBLOBs(@Param("record") VehicleOrderAdTmp record, @Param("example") VehicleOrderAdTmpCriteria example);

    int updateByExample(@Param("record") VehicleOrderAdTmp record, @Param("example") VehicleOrderAdTmpCriteria example);

    int updateByPrimaryKeySelective(VehicleOrderAdTmp record);

    int updateByPrimaryKeyWithBLOBs(VehicleOrderAdTmp record);

    int updateByPrimaryKey(VehicleOrderAdTmp record);
}