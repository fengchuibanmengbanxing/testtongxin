package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:01
 */
/**
 * 火焰
 * */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Flame {
    private int groupName;
    private int numbering;
    private boolean isFlame;

}