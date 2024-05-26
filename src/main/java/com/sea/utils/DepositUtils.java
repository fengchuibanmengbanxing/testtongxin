package com.sea.utils;

import cn.hutool.json.JSONUtil;
import com.sea.Entity.*;
import com.sea.mapper.*;
import com.sea.service.WenShiduService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.Time;
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

    @Autowired
    private WenDuMapper wenDuMapper;

    @Autowired
    private FlameMapper flameMapper;

    @Autowired
    private FumesMapper fumesMapper;

    @Autowired
    private InfraredMapper infraredMapper;

    @Autowired
    private PhotoSensitiveMapper photoSensitiveMapper;

    @Autowired
    private RainDropMapper rainDropMapper;

    @Autowired
    private ServosMapper servosMapper;

    @Autowired
    private SoilMapper soilMapper;




    public void insert(String data[]) {


        try {
             switch (data[1]) {
                case "1":
                    //温湿度
                    WenShidu  wenShidu=new WenShidu();
                    wenShidu.setGroupName(Integer.parseInt(data[0]));
                    wenShidu.setNumbering(Integer.parseInt(data[1]));
                    wenShidu.setWendu(Integer.parseInt(data[2]));
                    wenShidu.setShidu(Integer.parseInt(data[3].trim()));
//                    System.out.println(wenShidu.toString());
                    wenShiduMapper.WenShiduInsert(wenShidu);

                    break;
                case "2":
                    //光敏
                    PhotoSensitive photoSensitive = new PhotoSensitive();
                    photoSensitive.setGroupName(Integer.parseInt(data[0]));
                    photoSensitive.setNumbering(Integer.parseInt(data[1]));
                    photoSensitive.setPhotosensitive(Boolean.parseBoolean(data[2]));
                    //TODO

                    break;
                case "3":
                    //人体红外
                    Infrared infrared = new Infrared();
                    infrared.setGroupName(Integer.parseInt(data[0]));
                    infrared.setNumbering(Integer.parseInt(data[1]));
                    infrared.setInfrared(Boolean.parseBoolean(data[2]));

                    break;
                case "4":
                    //烟雾
                    Fumes fumes = new Fumes();
                    fumes.setGroupName(Integer.parseInt(data[0]));
                    fumes.setNumbering(Integer.parseInt(data[1]));
                    fumes.setFumes(Boolean.parseBoolean(data[2]));
                    
                    break;
                case "5":
                   //火焰
                    Flame flame = new Flame();
                    flame.setGroupName(Integer.parseInt(data[0]));
                    flame.setNumbering(Integer.parseInt(data[1]));
                    flame.setFlame(Boolean.parseBoolean(data[2]));

                    break;
                case "6":
                   //雨滴
                    RainDrop rainDrop = new RainDrop();
                    rainDrop.setGroupName(Integer.parseInt(data[0]));
                    rainDrop.setNumbering(Integer.parseInt(data[0]));
                    rainDrop.setRaindrop(Boolean.parseBoolean(data[2]));

                    break;
                case "7":
                   //土壤
                    Soil soil = new Soil();
                    soil.setGroupName(Integer.parseInt(data[0]));
                    soil.setNumbering(Integer.parseInt(data[1]));
                    soil.setSoil(Boolean.parseBoolean(data[2]));

                    break;
                case "8":
                  //舵机

                    break;
                case "9":
                    //温度
                    WenDu wenDu = new WenDu();
                    wenDu.setGroupName(Integer.parseInt(data[0]));
                    wenDu.setNumbering(Integer.parseInt(data[1]));
                    wenDu.setWendu(Integer.parseInt(data[2]));

                    break;
                 case "10":
                     //红外测距
                     Ranging ranging = new Ranging();
                     ranging.setGroupName(Integer.parseInt(data[0]));
                     ranging.setNumbering(Integer.parseInt(data[1]));
                     ranging.setDistance(Double.parseDouble(data[2]));
                     break;
                 case "11":
                     //指纹

                     System.out.println("指纹！");
                     break;
                 case "12":
                     //ID卡

                     System.out.println("ID卡！");
                     break;

                default:
                    System.out.println("无法分辨传感器型号！");
                    break;
            }
        } catch (NumberFormatException e) {
            log.info("解析数据格式失败！");
            throw new RuntimeException(e);
        }

    }
}
