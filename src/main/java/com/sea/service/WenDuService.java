package com.sea.service;

import com.sea.Entity.WenDu;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:36
 */
public interface WenDuService {
    //返回温度list集合
    List<WenDu> findWenDu(int groupName, int numbering);

    void insertWenDu();

}
