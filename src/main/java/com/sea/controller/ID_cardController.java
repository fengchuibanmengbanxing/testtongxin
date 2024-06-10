package com.sea.controller;

import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.ID_cardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 清醒
 * @Date 2024/5/26 17:18
 */
@RestController
@RequestMapping("/ID_card")
public class ID_cardController {

    @Autowired
    private ID_cardService id_cardService;
    @RequestMapping("/findId_card")
    public Result fingerPrint(@RequestParam("groupName") int groupName,
                              @RequestParam("numbering") int numbering ){
        String id_cardServiceNum=id_cardService.findFirstId(groupName,numbering);
        return Result.build(id_cardServiceNum, ResultCodeEnum.SUCCESS);
    }
}