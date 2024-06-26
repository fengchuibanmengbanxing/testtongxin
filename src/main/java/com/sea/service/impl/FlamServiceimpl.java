package com.sea.service.impl;

import com.sea.Entity.Flame;
import com.sea.mapper.FlameMapper;
import com.sea.service.FlamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:37
 */

@Service
public class FlamServiceimpl implements FlamService {
    @Autowired
    private FlameMapper flameMapper;

    @Override
    public boolean isflame(int groupName, int numbering) {
     boolean isflame=flameMapper.isflame(groupName,numbering);
        return isflame;
    }

    @Override
    public boolean UpdateFlame() {
        Flame build = Flame.builder()
                .groupName(1)
                .numbering(1)
                .isFlame(true)
                .build();
        flameMapper.flameUpdate(build);
        return false;
    }
}
