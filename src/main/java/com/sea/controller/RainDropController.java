package com.sea.controller;

import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.PhotoSensitiveService;
import com.sea.service.RainDropService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:27
 */

@RestController
@Slf4j
@RequestMapping("/RainDrop")
public class RainDropController {

    @Autowired
    private RainDropService rainDropService;
    @RequestMapping("/findRainDrop")
    public Result isRainDrop(@RequestParam("groupName") int groupName,
                             @RequestParam("numbering") int numbering ){
        boolean isRainDrop=rainDropService.isRainDrop(groupName,numbering);
        return Result.build(isRainDrop, ResultCodeEnum.SUCCESS);
    }

    @RequestMapping("/insertRainDrop")
    public Result insertRainDrop(){
        boolean isRainDrop=rainDropService.insertRainDrop();
        return Result.build(isRainDrop, ResultCodeEnum.SUCCESS);
    }
}
