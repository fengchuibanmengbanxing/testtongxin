package com.sea.mapper;

import com.sea.Entity.WenDu;
import com.sea.Entity.WenShidu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:35
 */
@Mapper
public interface WenDuMapper {
    public void WenDuInsert(WenDu wenDu);

    //返回温度集合
    List<WenDu> findWenDu(int groupName, int numbering);
}
