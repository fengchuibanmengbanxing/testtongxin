package com.sea.listener;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sea.Entity.Fumes;
import com.sea.Entity.Infrared;
import com.sea.Entity.PhotoSensitive;
import com.sea.Entity.WenShidu;
import com.sea.config.SerialPortManager;
import com.sea.utils.DepositUtils;

import java.nio.charset.StandardCharsets;


public class SerialPortCallback {

    public void dataAvailable() {
        try {
            //当前监听器监听到的串口返回数据 back
            byte[] back = SerialPortManager.readSerialPortData();
            String utf_8 = new String(back, StandardCharsets.UTF_8);
            System.out.println(utf_8);
            //对传入数据进行解析区分组名与传感器名 json格式
            //将串口接收的数据转化为json对象
            JSONObject jsonObject = JSONUtil.parseObj(utf_8);
            //取出传感器编号
            int numbering = (int) jsonObject.get("numbering");
            //将传感器json数据存入对应数据库表
            DepositUtils.insert(numbering,utf_8);




//            System.out.println("back-"+(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))+"--"+ StrUtils.bytesToHeString(back));
//            String s = StrUtils.bytesToHeString(back);
//            System.out.println("rev--data:"+s);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}

