package com.sea.mapper;

import com.sea.Entity.ID_card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 清醒
 * @Date 2024/5/26 17:17
 */
@Mapper
public interface ID_cardMapper {
    public void iD_cardInsert(ID_card id_card);
    public String findFirstId(@Param("groupName") int groupName, @Param("numbering")int numbering);
}
