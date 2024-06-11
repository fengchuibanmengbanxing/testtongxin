package com.sea.controller;

import com.sea.Vo.common.Result;
import com.sea.Vo.common.ResultCodeEnum;
import com.sea.service.InfraredService;
import com.sea.service.PhotoSensitiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:27
 */

@RestController
@Slf4j
@RequestMapping("/PhotoSensitive")
public class PhotoSensitiveController {

    @Autowired
    private PhotoSensitiveService photoSensitiveService;

    @RequestMapping("/findPhotoSensitive")
    public Result isPhotoSensitive(@RequestParam("groupName") int groupName,
                                   @RequestParam("numbering") int numbering) {
        boolean isPhotoSensitive = photoSensitiveService.isPhotoSensitive(groupName, numbering);
        return Result.build(isPhotoSensitive, ResultCodeEnum.SUCCESS);
    }

    @RequestMapping("/insertPhotoSensitive")
    public Result insertPhotoSensitive() {
        boolean isPhotoSensitive = photoSensitiveService.insertPhotoSensitive();
        return Result.build(isPhotoSensitive, ResultCodeEnum.SUCCESS);
    }

}
