package com.sea.service.impl;

import com.sea.Entity.Ranging;
import com.sea.mapper.RangingMapper;
import com.sea.service.RangingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/30 14:31
 */
@Service
public class RangingServiceimpl implements RangingService {
    @Autowired
    private RangingMapper rangingMapper;

    @Override
    public List<Ranging> findRanging(int groupName, int numbering) {

        return  rangingMapper.findRanging(groupName,numbering);
    }
}
