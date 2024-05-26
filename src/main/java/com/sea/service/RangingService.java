package com.sea.service;

import com.sea.Entity.Ranging;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/30 14:32
 */
public interface RangingService {
    //红外测距
    List<Ranging> findRanging(int groupName, int numbering);
}
