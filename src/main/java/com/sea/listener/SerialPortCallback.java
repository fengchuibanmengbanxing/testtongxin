package com.sea.listener;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sea.Entity.Fumes;
import com.sea.Entity.Infrared;
import com.sea.Entity.PhotoSensitive;
import com.sea.Entity.WenShidu;
import com.sea.config.SerialPortManager;
import com.sea.utils.BeanUtils;
import com.sea.utils.DepositUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.charset.StandardCharsets;

@Slf4j
public class SerialPortCallback {

    private DepositUtils depositUtils = BeanUtils.getBean(DepositUtils.class);


    public void dataAvailable() {
        try {
            //当前监听器监听到的串口返回数据 back
            byte[] back = SerialPortManager.readSerialPortData();
            String utf_8 = new String(back, StandardCharsets.UTF_8);
            //打印
            log.info(utf_8);
            String[] data = utf_8.split(",|\\\\n");
            if (data != null) {
                depositUtils.insert(data);
            }


            //对传入数据进行解析区分组名与传感器名 json格式
//            boolean isjson = JSONUtil.isJson(utf_8);
//            if (isjson) {
//                //将串口接收的数据转化为json对象
//                JSONObject jsonObject = JSONUtil.parseObj(utf_8);
//                //取出传感器编号
//                int numbering = (int) jsonObject.get("numbering");
//                //将传感器json数据存入对应数据库表
//                depositUtils.insert(numbering, utf_8);
//            } else {
//                log.error("传入数据非json格式！");
//            }


        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}

