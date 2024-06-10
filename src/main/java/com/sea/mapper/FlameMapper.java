package com.sea.mapper;

import com.sea.Entity.Flame;
import com.sea.Entity.WenShidu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:29
 */
@Mapper
public interface FlameMapper {

    public void flameUpdate(Flame flame);

    //查询是否有火焰
    public boolean isflame(@Param("groupName") int groupName, @Param("numbering")int numbering);

}
