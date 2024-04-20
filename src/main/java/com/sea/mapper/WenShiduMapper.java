package com.sea.mapper;

import com.sea.Entity.WenShidu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/19 19:15
 */
@Mapper
public interface WenShiduMapper {

 public void WenShiduInsert(WenShidu wenShidu);

//温湿度
 public List<WenShidu> WenShiduSelect(@Param("groupname" )int groupname,
                                      @Param("numbering" )int numbering);

}
