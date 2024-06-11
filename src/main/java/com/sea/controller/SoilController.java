package com.sea.controller;

import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.RainDropService;
import com.sea.service.SoilService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:28
 */

@RestController
@Slf4j
@RequestMapping("/Soil")
public class SoilController {
    @Autowired
    private SoilService soilService;
    @RequestMapping("/findSoil")
    public Result isSoil(@RequestParam("groupName") int groupName,
                             @RequestParam("numbering") int numbering ){
        boolean isSoil=soilService.isSoil(groupName,numbering);
        return Result.build(isSoil, ResultCodeEnum.SUCCESS);
    }

    @RequestMapping("/insertSoil")
    public Result insertSoil(){
        boolean isSoil=soilService.insertSoil();
        return Result.build(isSoil, ResultCodeEnum.SUCCESS);
    }
}
