package com.sea.mapper;

import com.sea.Entity.Co;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:36
 */
@Mapper
public interface CoMapper {


    void findCoList(@Param("groupName") int groupName,@Param("numbering") int numbering);

    void coInsert(Co co);

}
