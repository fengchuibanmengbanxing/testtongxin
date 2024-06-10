package com.sea.controller;

import com.sea.Entity.Ranging;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.RainDropService;
import com.sea.service.RangingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/30 14:06
 */

@RestController
@Slf4j
@RequestMapping("/Ranging")
public class RangingController {
    @Autowired
    private RangingService rangingService;

    @RequestMapping("/findRanging")
    public Result isRainDrop(@RequestParam("groupName") int groupName,
                             @RequestParam("numbering") int numbering) {
        List<Ranging> rangingList = rangingService.findRanging(groupName, numbering);
        Collections.reverse(rangingList);
        return Result.build(rangingList, ResultCodeEnum.SUCCESS);
    }
}
