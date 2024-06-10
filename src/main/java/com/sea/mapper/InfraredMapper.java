package com.sea.mapper;

import com.sea.Entity.Flame;
import com.sea.Entity.Infrared;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:30
 */
@Mapper
public interface InfraredMapper {

    public void infraredUpdate(Infrared Infrared);

    //是否有雨滴
    boolean isInfrared(@Param("groupName") int groupName, @Param("numbering")int numbering);

}
