package com.sea.service;

import com.sea.Entity.Pm;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:38
 */
public interface PmService {
    List<Pm> findPmList(int groupName, int numbering);

    List<Pm> insertPm();

}
