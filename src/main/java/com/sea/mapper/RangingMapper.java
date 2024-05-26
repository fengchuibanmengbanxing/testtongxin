package com.sea.mapper;

import com.sea.Entity.Ranging;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/5/10 16:43
 */
@Mapper
public interface RangingMapper {


    List<Ranging> findRanging(int groupName, int numbering);

}
