package com.sea.controller;

import com.sea.Entity.Co;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.CoService;
import com.sea.service.FingerPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:56
 */

@RestController
@RequestMapping("/Co")
public class CoController {

    @Autowired
    private CoService coService;

    @RequestMapping("/findCo")
    public Result findCo(@RequestParam("groupName") int groupName,
                         @RequestParam("numbering") int numbering) {
        List<Co> coList = coService.findCoList(groupName, numbering);
        return Result.build(coList, ResultCodeEnum.SUCCESS);
    }

    @RequestMapping("/insert")
    public Result insertCo() {
        coService.insertCo();
        return Result.build(true, ResultCodeEnum.SUCCESS);
    }
}
