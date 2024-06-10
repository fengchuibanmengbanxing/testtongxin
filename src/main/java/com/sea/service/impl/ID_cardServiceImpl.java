package com.sea.service.impl;

import com.sea.mapper.ID_cardMapper;
import com.sea.service.ID_cardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/5/26 17:17
 */
@Service
public class ID_cardServiceImpl implements ID_cardService {

    @Autowired
    private ID_cardMapper id_cardMapper;
    @Override
    public String findFirstId(int groupName, int numbering) {
        return   id_cardMapper.findFirstId(groupName,numbering);

    }
}
