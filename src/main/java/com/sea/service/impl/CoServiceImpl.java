package com.sea.service.impl;

import com.sea.Entity.Co;
import com.sea.mapper.CoMapper;
import com.sea.service.CoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:37
 */
@Service
public class CoServiceImpl implements CoService {
    @Autowired
    private CoMapper coMapper;

    @Override
    public List<Co> findCoList(int groupName, int numbering) {
        return coMapper.findCoList(groupName, numbering);
    }

    @Override
    public void insertCo() {
        Co build = Co.builder()
                .concentration(0)
                .groupName(1)
                .numbering(1)
                .time(null)
                .build();
        coMapper.coInsert(build);
    }


}
