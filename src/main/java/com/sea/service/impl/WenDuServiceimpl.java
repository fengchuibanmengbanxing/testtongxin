package com.sea.service.impl;

import com.sea.Entity.WenDu;
import com.sea.mapper.SoilMapper;
import com.sea.mapper.WenDuMapper;
import com.sea.service.FlamService;
import com.sea.service.WenDuService;
import com.sea.service.WenShiduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:38
 */
@Service
public class WenDuServiceimpl implements WenDuService {

    @Autowired
    private WenDuMapper wenDuMapper;

    @Override
    public List<WenDu> findWenDu(int groupName, int numbering) {
        List<WenDu> wenDuList = wenDuMapper.findWenDu(groupName, numbering);
        return  wenDuList;

    }
}
