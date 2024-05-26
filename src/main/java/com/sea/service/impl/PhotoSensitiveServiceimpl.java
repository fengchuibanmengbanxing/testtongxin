package com.sea.service.impl;

import com.sea.mapper.InfraredMapper;
import com.sea.mapper.PhotoSensitiveMapper;
import com.sea.service.FlamService;
import com.sea.service.PhotoSensitiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:37
 */
@Service
public class PhotoSensitiveServiceimpl implements PhotoSensitiveService {
    @Autowired
    private PhotoSensitiveMapper photoSensitiveMapper;

    @Override
    public boolean isPhotoSensitive(int groupName, int numbering) {
        photoSensitiveMapper.isPhotoSensitive( groupName, numbering);
        return false;
    }
}
