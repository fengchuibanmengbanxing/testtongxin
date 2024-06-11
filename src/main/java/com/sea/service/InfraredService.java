package com.sea.service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:33
 */
public interface InfraredService {
    //是否有雨滴
    boolean isInfrared(int groupName, int numbering);


    boolean insertInfrared();

}
