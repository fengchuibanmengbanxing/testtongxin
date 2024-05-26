package com.sea.mapper;

import com.sea.Entity.Flame;
import com.sea.Entity.Infrared;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:30
 */
@Mapper
public interface InfraredMapper {

    public void InfraredUpdate(Infrared Infrared);

    //是否有雨滴
    boolean isInfrared(int groupName, int numbering);

}
