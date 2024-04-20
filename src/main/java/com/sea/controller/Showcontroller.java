package com.sea.controller;

import com.sea.Entity.WenShidu;
import com.sea.service.WenShiduService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/19 19:11
 */

@RestController
@Slf4j
public class Showcontroller {
    @Autowired
    private WenShiduService wenShiduService;

    @RequestMapping("/find/{groupname}/{numbering}")
    public List findwenshidu(@PathVariable("groupname") int groupname,
                             @PathVariable("numbering") int numbering){
       List<WenShidu> list=wenShiduService.WenShiduSelect(groupname,numbering);
       //TODO Result
       return list;
    }

    //test
    @RequestMapping("/find")
    public void findwenshidu(){
        String s="1,1,20,30";
        String[] split = s.split(",");
        int i1 = Integer.parseInt(split[0]);
        int i2= Integer.parseInt(split[1]);
        double i3 = Integer.parseInt(split[2]);
        double i4 = Integer.parseInt(split[3]);
        WenShidu wenShidu = new WenShidu();
        wenShidu.setGroupname(i1);
        wenShidu.setNumbering(i2);
        wenShidu.setWendu(i3);
        wenShidu.setShidu(i4);
        wenShiduService.WenShiduInsert(wenShidu);
    }

}
