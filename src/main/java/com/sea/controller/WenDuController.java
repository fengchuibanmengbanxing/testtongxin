package com.sea.controller;

import com.sea.Entity.WenDu;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.FlamService;
import com.sea.service.WenDuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:24
 */

@RestController
@Slf4j
@RequestMapping("/WenDu")
public class WenDuController {
    @Autowired
    private WenDuService wenDuService;

    @RequestMapping("/findWenDu")
    public Result findWenDu(@RequestParam("groupName") int groupName,
                            @RequestParam("numbering") int numbering) {
        //返回list集合
        List<WenDu> wendulist = wenDuService.findWenDu(groupName, numbering);
        Collections.reverse(wendulist);
        return Result.build(wendulist, ResultCodeEnum.SUCCESS);
    }

    @RequestMapping("/insertWenDu")
    public Result insertWenDu() {
        //返回list集合
      wenDuService.insertWenDu();

        return Result.build(true, ResultCodeEnum.SUCCESS);
    }

}
