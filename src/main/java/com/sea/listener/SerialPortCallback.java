package com.sea.listener;


import com.sea.config.SerialPortManager;
import com.sea.utils.StrUtils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SerialPortCallback {

    public void dataAvailable() {
        try {
            //当前监听器监听到的串口返回数据 back
            byte[] back = SerialPortManager.readSerialPortData();
            System.out.println("back-"+(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))+"--"+ StrUtils.bytesToHeString(back));
            String s = StrUtils.bytesToHeString(back);
            System.out.println("rev--data:"+s);
            //throw new Exception();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}

