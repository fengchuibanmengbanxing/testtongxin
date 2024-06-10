package com.sea.service.impl;

import com.sea.mapper.FingerPrintMapper;
import com.sea.service.FingerPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 清醒
 * @Date 2024/5/26 16:51
 */
@Service
public class FingerPrintServiceImpl implements FingerPrintService {

    @Autowired
    private  FingerPrintMapper fingerPrintMapper;
    /**
     *查找最新数据
     */
    @Override
    public String findFirst(int groupName, int numbering) {
        return  fingerPrintMapper.findFirst(groupName,numbering);
    }
}
