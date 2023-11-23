package com.sea;

import com.sea.config.SerialPortManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SerialPortStudyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SerialPortStudyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        try{
            //  win
            SerialPortManager.connectSerialPort("COM1");
            //  linux centos
            //SerialPortManager.connectSerialPort("ttyS1");
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
    @PreDestroy
    public void destroy() {
        SerialPortManager.closeSerialPort();
    }
}
