package com.sea.service.impl;

import com.sea.Entity.WenShidu;
import com.sea.Vo.common.Result;
import com.sea.mapper.WenShiduMapper;
import com.sea.service.WenShiduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 清醒
 * @Date 2024/4/19 19:15
 */
@Service
public class WenShiduServiceimpl implements WenShiduService {

    @Autowired
    private WenShiduMapper wenShiduMapper;

    @Override
    public void WenShiduInsert(WenShidu wenShidu) {
        wenShiduMapper.WenShiduInsert(wenShidu);
    }

    @Override
    public List<WenShidu> WenShiduSelect(int groupname, int numbering) {
        //温湿度传感器集合
       List<WenShidu> list= wenShiduMapper.WenShiduSelect(groupname,numbering);
       return list;
    }


}
