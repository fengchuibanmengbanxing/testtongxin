package com.sea.mapper;

import com.sea.Entity.Flame;
import com.sea.Entity.WenShidu;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:29
 */
@Mapper
public interface FlameMapper {

    public void FlameUpdate(Flame flame);

    //查询是否有火焰
    public boolean isflame(int groupName, int numbering);

}
