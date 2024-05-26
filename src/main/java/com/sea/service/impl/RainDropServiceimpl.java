package com.sea.service.impl;

import com.sea.mapper.PhotoSensitiveMapper;
import com.sea.mapper.RainDropMapper;
import com.sea.service.RainDropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:37
 */
@Service
public class RainDropServiceimpl implements RainDropService {

    @Autowired
    private RainDropMapper rainDropMapper;

    @Override
    public boolean isRainDrop(int groupName, int numbering) {
        boolean rainDrop = rainDropMapper.isRainDrop(groupName, numbering);
        return rainDrop;
    }
}
