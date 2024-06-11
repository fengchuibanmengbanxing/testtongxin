package com.sea.service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:34
 */
public interface FumesService {
    //查询是否有烟雾
    boolean isfumes(int groupName, int numbering);

    boolean insertFlame();


}
