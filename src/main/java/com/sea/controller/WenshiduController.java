package com.sea.controller;

import com.sea.Entity.WenDu;
import com.sea.Entity.WenShidu;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.WenDuService;
import com.sea.service.WenShiduService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/23 20:26
 */

@RestController
@Slf4j
@RequestMapping("/WenShiDu")
public class WenshiduController {

    @Autowired
    private WenShiduService wenShiduService;
    @RequestMapping("/findWenShiDu")
    public Result findWenShiDu(@RequestParam("groupName") int groupName,
                               @RequestParam("numbering") int numbering ){
        //返回list集合
        List<WenShidu> wenshidulist=wenShiduService.findWenShiDu(groupName,numbering);
        Collections.reverse(wenshidulist);
        return Result.build(wenshidulist, ResultCodeEnum.SUCCESS);
    }
}
