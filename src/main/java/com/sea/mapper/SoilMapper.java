package com.sea.mapper;

import com.sea.Entity.Servos;
import com.sea.Entity.Soil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:35
 */
@Mapper
public interface SoilMapper {
    public void soilUpdate(Soil soil);
    //土壤是否湿润
    boolean isSoil(@Param("groupName") int groupName, @Param("numbering")int numbering);
}
