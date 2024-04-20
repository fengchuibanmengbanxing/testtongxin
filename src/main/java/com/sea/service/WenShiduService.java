package com.sea.service;

import com.sea.Entity.WenShidu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/19 19:15
 */
public interface WenShiduService {
    public void WenShiduInsert(WenShidu wenShidu);
    //温湿度
    public List<WenShidu> WenShiduSelect( int groupname,int numbering);


}
