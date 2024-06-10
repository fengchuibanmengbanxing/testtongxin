package com.sea.service.impl;

import com.sea.mapper.RainDropMapper;
import com.sea.mapper.ServosMapper;
import com.sea.service.FlamService;
import com.sea.service.ServosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:37
 */
@Service
public class ServosServiceimpl implements ServosService {

    @Autowired
    private ServosMapper servosMapper;

    @Override
    public int findServos(int groupName, int numbering) {
        int angle =servosMapper.findServos(groupName,numbering);
        return angle;
    }
}
