package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 清醒
 * @Date 2024/4/19 15:29
 */


/**
 人体红外
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Infrared {
    private int groupName;
    private int numbering;
    private boolean isInfrared;

}
