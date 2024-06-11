package com.sea.service.impl;

import com.sea.Entity.Infrared;
import com.sea.mapper.FumesMapper;
import com.sea.mapper.InfraredMapper;
import com.sea.service.FlamService;
import com.sea.service.InfraredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:37
 */
@Service
public class InfraredServiceimpl implements InfraredService {


    @Autowired
    private InfraredMapper infraredMapper;

    @Override
    public boolean isInfrared(int groupName, int numbering) {
        boolean infrared = infraredMapper.isInfrared(groupName, numbering);
        return infrared;
    }

    @Override
    public boolean insertInfrared() {
        Infrared build = Infrared.builder()
                .groupName(1)
                .numbering(1)
                .isInfrared(true)
                .build();
        infraredMapper.infraredUpdate(build);
        return true;
    }
}
