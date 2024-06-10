package com.sea.mapper;

import com.sea.Entity.Flame;
import com.sea.Entity.Fumes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:29
 */
@Mapper
public interface FumesMapper {

    public void fumesUpdate(Fumes fumes );

    //查询是否有烟雾
    boolean isfumes(@Param("groupName") int groupName, @Param("numbering")int numbering);
}
