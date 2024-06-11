package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author 清醒
 * @Date 2024/4/30 14:04
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//红外测距
public class Ranging {

    private int groupName;
    private int numbering;
    private double distance;
    private Time time;

}
