package com.sea.utils;

import cn.hutool.json.JSONUtil;
import com.sea.Entity.*;
import com.sea.mapper.*;
import com.sea.service.WenShiduService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 清醒
 * @Date 2024/4/20 18:40
 */
@Slf4j
@Component
@NoArgsConstructor
public class DepositUtils {

    public HashSet<Integer> getHashset() {
        return hashset;
    }

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
    @Autowired
    private FingerPrintMapper fingerPrintMapper;
    @Autowired
    private ID_cardMapper id_cardMapper;
    @Autowired
    private PmMapper pmMapper;
    @Autowired
    private CoMapper coMapper;

    @Autowired
    private RangingMapper rangingMapper;


    //可重入锁
    ReentrantLock lock = new ReentrantLock(true);
    WenShidu wenShidu = new WenShidu();
    PhotoSensitive photoSensitive = new PhotoSensitive();
    Infrared infrared = new Infrared();
    Fumes fumes = new Fumes();
    Flame flame = new Flame();
    RainDrop rainDrop = new RainDrop();
    Soil soil = new Soil();
    WenDu wenDu = new WenDu();
    Ranging ranging = new Ranging();
    FingerPrint fingerPrint = new FingerPrint();
    ID_card id_card = new ID_card();
    Pm pm = new Pm();
    Co co = new Co();
    Servos servos = new Servos();
    HashSet<Integer> hashset = new HashSet<>();

    @Transactional
    public void insert(String data[]) {
        try {
            switch (data[1]) {
                case "1":
                    //温湿度
                    wenShidu.setGroupName(Integer.parseInt(data[0]));
                    wenShidu.setNumbering(Integer.parseInt(data[1]));
                    wenShidu.setWendu(Integer.parseInt(data[2]));
                    wenShidu.setShidu(Integer.parseInt(data[3].trim()));
                    wenShiduMapper.WenShiduInsert(wenShidu);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "2":
                    //光敏
                    photoSensitive.setGroupName(Integer.parseInt(data[0]));
                    photoSensitive.setNumbering(Integer.parseInt(data[1]));
                    photoSensitive.setPhotosensitive(Boolean.parseBoolean(data[2]));
                    photoSensitiveMapper.photoSensitiveUpdate(photoSensitive);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "3":
                    //人体红外
                    infrared.setGroupName(Integer.parseInt(data[0]));
                    infrared.setNumbering(Integer.parseInt(data[1]));
                    infrared.setInfrared(Boolean.parseBoolean(data[2]));
                    infraredMapper.infraredUpdate(infrared);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "4":
                    //烟雾
                    fumes.setGroupName(Integer.parseInt(data[0]));
                    fumes.setNumbering(Integer.parseInt(data[1]));
                    fumes.setFumes(Boolean.parseBoolean(data[2]));
                    fumesMapper.fumesUpdate(fumes);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "5":
                    //火焰
                    flame.setGroupName(Integer.parseInt(data[0]));
                    flame.setNumbering(Integer.parseInt(data[1]));
                    flame.setFlame(Boolean.parseBoolean(data[2]));
                    flameMapper.flameUpdate(flame);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "6":
                    //雨滴
                    rainDrop.setGroupName(Integer.parseInt(data[0]));
                    rainDrop.setNumbering(Integer.parseInt(data[0]));
                    rainDrop.setRaindrop(Boolean.parseBoolean(data[2]));
                    rainDropMapper.rainDropUpdate(rainDrop);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "7":
                    //土壤
                    soil.setGroupName(Integer.parseInt(data[0]));
                    soil.setNumbering(Integer.parseInt(data[1]));
                    soil.setSoil(Boolean.parseBoolean(data[2]));
                    soilMapper.soilUpdate(soil);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "8":
                    //舵机

                    servos.setGroupName(Integer.parseInt(data[0]));
                    servos.setNumbering(Integer.parseInt(data[1]));
                    servos.setAngle(Integer.parseInt(data[2]));
                    servosMapper.ServosUpdate(servos);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "9":
                    //温度
                    wenDu.setGroupName(Integer.parseInt(data[0]));
                    wenDu.setNumbering(Integer.parseInt(data[1]));
                    wenDu.setWendu(Integer.parseInt(data[2]));
                    wenDuMapper.wenDuInsert(wenDu);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "10":
                    //红外测距
                    ranging.setGroupName(Integer.parseInt(data[0]));
                    ranging.setNumbering(Integer.parseInt(data[1]));
                    ranging.setDistance(Double.parseDouble(data[2]));
                    rangingMapper.rangingInsert(ranging);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "11":
                    //指纹
                    fingerPrint.setGroupName(Integer.parseInt(data[0]));
                    fingerPrint.setNumbering(Integer.parseInt(data[1]));
                    fingerPrint.setNumber(data[2]);
                    fingerPrintMapper.fingerPrintInsert(fingerPrint);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "12":
                    //ID卡
                    id_card.setGroupName(Integer.parseInt(data[0]));
                    id_card.setNumbering(Integer.parseInt(data[1]));
                    id_card.setCardNumber(data[2]);
                    id_cardMapper.iD_cardInsert(id_card);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "13":
                    //二氧化碳
                    co.setGroupName(Integer.parseInt(data[0]));
                    co.setNumbering(Integer.parseInt(data[1]));
                    co.setConcentration(Integer.parseInt(data[2]));
                    coMapper.coInsert(co);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
                    break;
                case "14":
                    //PM2.5
                    pm.setGroupName(Integer.parseInt(data[0]));
                    pm.setNumbering(Integer.parseInt(data[1]));
                    pm.setConcentration(Float.parseFloat(data[2]));
                    pmMapper.pmInsert(pm);
                    if (!hashset.contains(Integer.parseInt(data[0]))) {
                        hashset.add(Integer.parseInt(data[0]));
                    }
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
