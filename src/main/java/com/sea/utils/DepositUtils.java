package com.sea.utils;

import cn.hutool.json.JSONUtil;
import com.sea.Entity.Fumes;
import com.sea.Entity.Infrared;
import com.sea.Entity.PhotoSensitive;
import com.sea.Entity.WenShidu;
import com.sea.mapper.WenShiduMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author 清醒
 * @Date 2024/4/20 18:40
 */

public class DepositUtils {
    @Autowired
    private static WenShiduMapper wenShiduMapper;
    public static void insert(int numbering, String utf_8) {

        switch (numbering) {
            case 1:
                //温湿度
                WenShidu wenShidu = JSONUtil.toBean(utf_8, WenShidu.class);
                wenShiduMapper.WenShiduInsert(wenShidu);
                break;
            case 2:
                //光敏
                PhotoSensitive photoSensitive = JSONUtil.toBean(utf_8, PhotoSensitive.class);

                break;
            case 3:
                //红外
                Infrared infrared = JSONUtil.toBean(utf_8, Infrared.class);

                break;
            case 4:
                //烟雾
                Fumes fumes = JSONUtil.toBean(utf_8, Fumes.class);

                break;
            default:
                System.out.println("无法分辨传感器型号！");
                break;
        }
    }
}
