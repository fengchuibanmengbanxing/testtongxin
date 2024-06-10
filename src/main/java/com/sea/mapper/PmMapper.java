package com.sea.mapper;

import com.sea.Entity.Pm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:38
 */
@Mapper
public interface PmMapper {


    List<Pm> findPmList(@Param("groupName") int groupName, @Param("numbering") int numbering);

    void pmInsert(Pm pm);
}
