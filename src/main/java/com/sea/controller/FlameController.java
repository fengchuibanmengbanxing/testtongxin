package com.sea.controller;

import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.FlamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:25
 */

@RestController
@Slf4j
@RequestMapping("/Flame")
public class FlameController {

    @Autowired
    private FlamService flamService;
    @RequestMapping("/findFlame")
   public Result ifFlame(@RequestParam("groupName") int groupName,
                         @RequestParam("numbering") int numbering ){
       boolean isflame=flamService.isflame(groupName,numbering);
        return Result.build(isflame, ResultCodeEnum.SUCCESS);
    }

}
