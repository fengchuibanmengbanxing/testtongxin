package com.sea.controller;

import com.sea.Entity.FingerPrint;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.FingerPrintService;
import com.sea.service.FlamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 清醒
 * @Date 2024/5/26 16:51
 */
@RestController
@RequestMapping("/FingerPrint")
public class FingerPrintController {

    @Autowired
    private FingerPrintService fingerPrintService;
    @RequestMapping("/findFerPrint")
    public Result fingerPrint(@RequestParam("groupName") int groupName,
                          @RequestParam("numbering") int numbering ){
        String fingerPrintNum=fingerPrintService.findFirst(groupName,numbering);
        return Result.build(fingerPrintNum, ResultCodeEnum.SUCCESS);
    }
}

