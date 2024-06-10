package com.sea.mapper;

import com.sea.Entity.FingerPrint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/5/26 16:50
 */
@Mapper
public interface FingerPrintMapper {


    String findFirst(@Param("groupName") int groupName, @Param("numbering")int numbering);
    void fingerPrintInsert(FingerPrint fingerPrint);
}
