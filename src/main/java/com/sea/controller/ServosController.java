package com.sea.controller;

import com.sea.Entity.Ranging;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.RangingService;
import com.sea.service.ServosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:28
 */

@RestController
@Slf4j
@RequestMapping("/Servos")
public class ServosController {
    @Autowired
    private ServosService servosService;

    @RequestMapping("/findServos")
    public Result isServos(@RequestParam("groupName") int groupName,
                             @RequestParam("numbering") int numbering) {
        int angle = servosService.findServos(groupName, numbering);

        return Result.build(angle, ResultCodeEnum.SUCCESS);
    }

    @RequestMapping("/insertServos")
    public Result insertServos() {
        int angle = servosService.insertServos();

        return Result.build(angle, ResultCodeEnum.SUCCESS);
    }
}
