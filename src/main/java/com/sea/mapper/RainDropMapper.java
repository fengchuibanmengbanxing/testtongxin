package com.sea.mapper;

import com.sea.Entity.PhotoSensitive;
import com.sea.Entity.RainDrop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:35
 */
@Mapper
public interface RainDropMapper {

    public void rainDropUpdate(RainDrop rainDrop);
    //是否有雨滴
    boolean isRainDrop(@Param("groupName") int groupName, @Param("numbering")int numbering);

}
