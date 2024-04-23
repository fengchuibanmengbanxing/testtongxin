package com.sea.utils;

import cn.hutool.json.JSONUtil;
import com.sea.Entity.Fumes;
import com.sea.Entity.Infrared;
import com.sea.Entity.PhotoSensitive;
import com.sea.Entity.WenShidu;
import com.sea.mapper.WenShiduMapper;
import com.sea.service.WenShiduService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/20 18:40
 */
@Slf4j
@Component
@NoArgsConstructor
public class DepositUtils {

    @Autowired
    private WenShiduMapper wenShiduMapper;

    public void insert(String data[]) {
        switch (data[1]) {
            case "1":
                //温湿度
                WenShidu  wenShidu=new WenShidu();
                wenShidu.setGroupname(Integer.parseInt(data[0]));
                wenShidu.setNumbering(Integer.parseInt(data[1]));
                wenShidu.setWendu(Double.parseDouble(data[2]));
                wenShidu.setShidu(Double.parseDouble(data[3]));
                System.out.println(wenShidu.toString());
//                wenShiduMapper.WenShiduInsert(wenShidu);
                break;
//            case 2:
//                //光敏
//                PhotoSensitive photoSensitive = JSONUtil.toBean(utf_8, PhotoSensitive.class);
//
//                break;
//            case 3:
//                //红外
//                Infrared infrared = JSONUtil.toBean(utf_8, Infrared.class);
//
//                break;
//            case 4:
//                //烟雾
//                Fumes fumes = JSONUtil.toBean(utf_8, Fumes.class);
//
//                break;
            default:
                System.out.println("无法分辨传感器型号！");
                break;
        }

    }
}
