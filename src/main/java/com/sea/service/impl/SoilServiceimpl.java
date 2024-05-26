package com.sea.service.impl;

import com.sea.mapper.ServosMapper;
import com.sea.mapper.SoilMapper;
import com.sea.service.FlamService;
import com.sea.service.SoilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:38
 */
@Service
public class SoilServiceimpl implements SoilService {

    @Autowired
    private SoilMapper soilMapper;

    @Override
    public boolean isSoil(int groupName, int numbering) {
        boolean soil = soilMapper.isSoil(groupName, numbering);
        return  soil;

    }
}
