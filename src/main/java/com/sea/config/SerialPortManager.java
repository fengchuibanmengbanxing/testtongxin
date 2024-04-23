package com.sea.config;


import com.fazecast.jSerialComm.SerialPort;
import com.sea.listener.SerialPortCallback;
import com.sea.listener.SerialPortListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 串口工具类
 */
public class SerialPortManager {

    public static final int SERIAL_BAUD_RATE = 115200;

    public static volatile boolean SERIAL_PORT_STATE = false;

    public static volatile SerialPort SERIAL_PORT_OBJECT = null;

    //查找所有可用端口
    public static List<String> getSerialPortList() {
        // 获得当前所有可用串口
        SerialPort[] serialPorts = SerialPort.getCommPorts();
        List<String> portNameList = new ArrayList<String>();
        // 将可用串口名添加到List并返回该List
        for(SerialPort serialPort:serialPorts) {
            portNameList.add(serialPort.getSystemPortName());
        }
        //去重
        portNameList = portNameList.stream().distinct().collect(Collectors.toList());
        return portNameList;
    }

    //  连接串口
    public static void connectSerialPort(String portName){
        SerialPort serialPort = SerialPortManager.openSerialPort(portName, SERIAL_BAUD_RATE);
        if(serialPort == null){
            System.out.println("该串口不存在");
            return;
        }
//            TimeUnit.MILLISECONDS.sleep(2000);
        //给当前串口对象设置监听器
        serialPort.addDataListener(new SerialPortListener(new SerialPortCallback()));

        if(serialPort.isOpen()) {
            SERIAL_PORT_OBJECT = serialPort;
            SERIAL_PORT_STATE = true;
            System.out.println(portName+"-- 已打开");
        }
    }


    //  打开串口
    public static SerialPort openSerialPort(String portName, Integer baudRate) {
        List<String> serialPortList = SerialPortManager.getSerialPortList();
        if (!(serialPortList.contains(portName))){
            return null;
        }
        /**
         * 判断该串口是否存在
         */
        SerialPort serialPort = SerialPort.getCommPort(portName);
        if (baudRate != null) {
            serialPort.setBaudRate(baudRate);
        }
        if (!serialPort.isOpen()) {  //开启串口
            serialPort.openPort(1000);
        }else{
            return serialPort;
        }
        serialPort.setFlowControl(SerialPort.FLOW_CONTROL_DISABLED);
        serialPort.setComPortParameters(baudRate, 8, SerialPort.ONE_STOP_BIT, SerialPort.NO_PARITY);
        serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING | SerialPort.TIMEOUT_WRITE_BLOCKING, 1000, 1000);
        return serialPort;
    }

    //  关闭串口
    public static void closeSerialPort() {
        if (SERIAL_PORT_OBJECT != null && SERIAL_PORT_OBJECT.isOpen()){
            SERIAL_PORT_OBJECT.closePort();
            SERIAL_PORT_STATE = false;
            SERIAL_PORT_OBJECT = null;
            System.out.println("串口关闭成功");
        }
    }

    //  发送字节数组
    public static void sendSerialPortData(byte[] content) {

        if (SERIAL_PORT_OBJECT != null && SERIAL_PORT_OBJECT.isOpen()){
            SERIAL_PORT_OBJECT.writeBytes(content, content.length);
        }

    }


    //  读取字节数组
    public static byte[] readSerialPortData() {
        if (SERIAL_PORT_OBJECT != null && SERIAL_PORT_OBJECT.isOpen()){
            byte[] reslutData = null;
            try {
                if (!SERIAL_PORT_OBJECT.isOpen()){return null;};
                int i=0;
                /**
                 * ，在循环条件中判断串口的缓冲区中是否有可读取的字节数（SERIAL_PORT_OBJECT.bytesAvailable()）。
                 * 同时，使用Thread.sleep(20)方法暂停当前线程20毫秒，以等待更多的数据到达串口缓冲区。这个循环最多执行5次
                 */
                while (SERIAL_PORT_OBJECT.bytesAvailable() > 0 && i++ < 2) Thread.sleep(20);
                byte[] readBuffer = new byte[SERIAL_PORT_OBJECT.bytesAvailable()];
                int numRead = SERIAL_PORT_OBJECT.readBytes(readBuffer, readBuffer.length);
                if (numRead > 0) {
                    reslutData = readBuffer;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return reslutData;
        }
        return null;
    }

}

