package com.sea.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sea.Entity.WenShidu;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.WenShiduService;
import com.sea.utils.DepositUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private DepositUtils depositUtils;

    @RequestMapping("/find/{groupName}/{numbering}")
    public List findwenshidu(@PathVariable("groupName") int groupName,
                             @PathVariable("numbering") int numbering) {
        List<WenShidu> list = wenShiduService.findWenShiDu(groupName, numbering);

        return list;
    }
    @RequestMapping("/findPhotoSensitive")
    public Result findwenshidu2() {
        return Result.build(true, ResultCodeEnum.SUCCESS);
    }
    @RequestMapping("/findRainDrop")
    public Result findwenshidu3() {
        return Result.build(true, ResultCodeEnum.SUCCESS);
    }



//    @RequestMapping("/test")
//    public void findwenshidutest(){
//        String utf_8 = " {\n" +
//                "        \"groupname\": 6,\n" +
//                "        \"numbering\": 1,\n" +
//                "        \"wendu\": 20,\n" +
//                "        \"shidu\": 30\n" +
//                "    }";
//        boolean isjson = JSONUtil.isJson(utf_8);
//        log.info("=================="+isjson);
//        if (isjson) {
//            //将串口接收的数据转化为json对象
//            JSONObject jsonObject = JSONUtil.parseObj(utf_8);
//            //取出传感器编号
//            int numbering = (int) jsonObject.get("numbering");
//            log.info(numbering+"  ");
//            //将传感器json数据存入对应数据库表
////            depositUtils.insert(numbering, utf_8);
//        } else {
//            log.error("传入数据非json格式！");
//        }
//
//    }


}
