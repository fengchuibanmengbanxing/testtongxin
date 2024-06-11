package com.sea.service.impl;

import com.sea.Entity.Pm;
import com.sea.mapper.PmMapper;
import com.sea.service.PmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:39
 */
@Service
public class PmServiceImpl implements PmService {
    @Autowired
    private PmMapper pmMapper;

    @Override
    public List<Pm> findPmList(int groupName, int numbering) {
        List<Pm> PMList = pmMapper.findPmList(groupName, numbering);
        return PMList;
    }

    @Override
    public List<Pm> insertPm() {
        Pm build = Pm.builder()
                .groupName(1)
                .numbering(1)
                .concentration(0.12f)
                .time(null)
                .build();
        pmMapper.pmInsert(build);
        return null;
    }

}
