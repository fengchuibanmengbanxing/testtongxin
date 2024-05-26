package com.sea.mapper;

import com.sea.Entity.Fumes;
import com.sea.Entity.PhotoSensitive;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:30
 */
@Mapper
public interface PhotoSensitiveMapper {
    public void PhotoSensitiveUpdate(PhotoSensitive photoSensitive );

    boolean isPhotoSensitive(int groupName, int numbering);
}
