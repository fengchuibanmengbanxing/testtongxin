package com.sea.service;

import com.sea.Entity.Co;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:36
 */
public interface CoService {
    List<Co> findCoList(int groupName, int numbering);

}
