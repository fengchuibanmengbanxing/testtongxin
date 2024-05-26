package com.sea.controller;

import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.FumesService;
import com.sea.service.InfraredService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:26
 */

@RestController
@Slf4j
@RequestMapping("/Infrared")
public class InfraredController {
    @Autowired
    private InfraredService infraredService;

    @RequestMapping("/findInfrared")
    public Result isInfrared(@RequestParam("groupName") int groupName,
                             @RequestParam("numbering") int numbering) {
        boolean isInfrared = infraredService.isInfrared(groupName, numbering);
        return Result.build(isInfrared, ResultCodeEnum.SUCCESS);
    }

}
