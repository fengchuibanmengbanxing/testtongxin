package com.sea.controller;



import com.sea.config.SerialPortManager;
import com.sea.utils.StrUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TestController {



    @GetMapping("/list")
    public List<String> listPorts() {
        List<String> portList = SerialPortManager.getSerialPortList();
        if(!portList.isEmpty()){
            return portList;
        }
        return null;
    }


    @GetMapping("/connectCOM")
    public String connect(){


        SerialPortManager.connectSerialPort("COM4");
        return "success";
    }

    @PostMapping("/send/{hexData}")
    @ResponseBody
    public String sendPorts() {

        if (SerialPortManager.SERIAL_PORT_STATE){
            SerialPortManager.sendSerialPortData(StrUtils.hexStringToBytes("01 02 03"));
            return "success";
        }
        return "fail";
    }


    @GetMapping("/close")
    public String close(){
        SerialPortManager.closeSerialPort();
        return "success";
    }


}
