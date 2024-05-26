package com.sea.mapper;

import com.sea.Entity.Flame;
import com.sea.Entity.Fumes;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:29
 */
@Mapper
public interface FumesMapper {

    public void FumesUpdate(Fumes fumes );

    //查询是否有烟雾
    boolean isfumes(int groupName, int numbering);
}
