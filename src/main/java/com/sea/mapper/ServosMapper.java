package com.sea.mapper;

import com.sea.Entity.RainDrop;
import com.sea.Entity.Servos;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:36
 */
@Mapper
public interface ServosMapper {
    public void ServosUpdate(Servos servos);

    int findServos(@Param("groupName") int groupName,@Param("numbering") int numbering);

}
