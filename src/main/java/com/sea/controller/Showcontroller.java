package com.sea.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sea.Entity.WenShidu;
import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.WenShiduService;
import com.sea.utils.DepositUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author 清醒
 * @Date 2024/4/19 19:11
 */

@RestController
@Slf4j
@RequestMapping("/Show")
public class Showcontroller {
    @Autowired
    private WenShiduService wenShiduService;

    @Autowired
    private DepositUtils depositUtils;

    @RequestMapping("/find/{groupName}/{numbering}")
    public List findwenshidu(@PathVariable("groupName") int groupName,
                             @PathVariable("numbering") int numbering) {
        List<WenShidu> list = wenShiduService.findWenShiDu(groupName, numbering);

        return list;
    }
    @RequestMapping("/findPhotoSensitive")
    public Result findwenshidu2() {
        return Result.build(true, ResultCodeEnum.SUCCESS);
    }
    @RequestMapping("/findRainDrop")
    public Result findwenshidu3() {
        return Result.build(true, ResultCodeEnum.SUCCESS);
    }

    @RequestMapping("/status")
    public Result status() {
        HashSet<Integer> hashset = depositUtils.getHashset();
        List<Integer> collect = hashset.stream().collect(Collectors.toList());
        return Result.build(collect, ResultCodeEnum.SUCCESS);
    }

}
