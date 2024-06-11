package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 清醒
 * @Date 2024/4/19 15:27
 */


/**
 光敏
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhotoSensitive {
    private int groupName;
    private int numbering;
    private  boolean isPhotosensitive;
}
