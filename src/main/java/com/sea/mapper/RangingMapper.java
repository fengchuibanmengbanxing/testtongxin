package com.sea.mapper;

import com.sea.Entity.Ranging;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/5/10 16:43
 */
@Mapper
public interface RangingMapper {


    List<Ranging> findRanging(@Param("groupName") int groupName, @Param("numbering")int numbering);

    void rangingInsert(Ranging ranging);

}
