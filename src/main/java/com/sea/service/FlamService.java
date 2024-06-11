package com.sea.service;

import com.sea.Entity.WenDu;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:32
 */
public interface FlamService {
    //查询是否有火焰
    boolean isflame(int groupName, int numbering);


    boolean UpdateFlame();
}
