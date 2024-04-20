package com.sea.listener;
import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import com.sea.config.SerialPortManager;


public class SerialPortListener implements SerialPortDataListener {


    /**
     * 串口接收数据事件处理类
     */
    private final SerialPortCallback serialPortCallback;


    public SerialPortListener(SerialPortCallback serialPortCallback) {
        this.serialPortCallback = serialPortCallback;
    }

    @Override
    public int getListeningEvents() { //必须是return这个才会开启串口工具的监听
        //可添加多个事件，然后再事件处理函数中通过判断事件的类型，进行不同的事件处理
        return SerialPort.LISTENING_EVENT_DATA_AVAILABLE | SerialPort.LISTENING_EVENT_PORT_DISCONNECTED;
    }

    @Override
    public void serialEvent(SerialPortEvent serialPortEvent) {
        if (serialPortCallback != null && serialPortEvent.getEventType() == SerialPort.LISTENING_EVENT_DATA_AVAILABLE) {
            serialPortCallback.dataAvailable();
        }
        else if(serialPortEvent.getEventType() == SerialPort.LISTENING_EVENT_PORT_DISCONNECTED){
            SerialPortManager.closeSerialPort();
            System.out.println("串口断开");
        }
    }
}



