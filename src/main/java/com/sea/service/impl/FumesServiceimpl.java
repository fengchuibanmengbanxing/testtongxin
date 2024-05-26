package com.sea.service.impl;

import com.sea.mapper.FlameMapper;
import com.sea.mapper.FumesMapper;
import com.sea.service.FlamService;
import com.sea.service.FumesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:37
 */
@Service
public class FumesServiceimpl implements FumesService {
    @Autowired
    private FumesMapper fumesMapper;

    @Override
    public boolean isfumes(int groupName, int numbering) {
        boolean isfumes = fumesMapper.isfumes(groupName, numbering);
        return isfumes;
    }
}
