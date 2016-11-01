package com.jiuxing.drm.dao;

import com.jiuxing.drm.model.VehicleOrderAd;
import com.jiuxing.drm.model.VehicleOrderAdCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleOrderAdMapper {
    int countByExample(VehicleOrderAdCriteria example);

    int deleteByExample(VehicleOrderAdCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleOrderAd record);

    int insertSelective(VehicleOrderAd record);

    List<VehicleOrderAd> selectByExampleWithBLOBs(VehicleOrderAdCriteria example);

    List<VehicleOrderAd> selectByExample(VehicleOrderAdCriteria example);

    VehicleOrderAd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleOrderAd record, @Param("example") VehicleOrderAdCriteria example);

    int updateByExampleWithBLOBs(@Param("record") VehicleOrderAd record, @Param("example") VehicleOrderAdCriteria example);

    int updateByExample(@Param("record") VehicleOrderAd record, @Param("example") VehicleOrderAdCriteria example);

    int updateByPrimaryKeySelective(VehicleOrderAd record);

    int updateByPrimaryKeyWithBLOBs(VehicleOrderAd record);

    int updateByPrimaryKey(VehicleOrderAd record);
}