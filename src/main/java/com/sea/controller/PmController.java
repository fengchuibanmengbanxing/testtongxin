package com.sea.controller;

import com.sea.Entity.Pm;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.PmService;
import com.sea.service.RainDropService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:39
 */
@RestController
@Slf4j
@RequestMapping("/Pm")
public class PmController {
    @Autowired
    private PmService pmService;
    @RequestMapping("/findPm")
    public Result findPm(@RequestParam("groupName") int groupName,
                             @RequestParam("numbering") int numbering ){
        List<Pm> PMList=pmService.findPmList(groupName,numbering);
        return Result.build(PMList, ResultCodeEnum.SUCCESS);
    }
}
