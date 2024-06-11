package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pm {
    private int groupName;
    private int numbering;
    private float concentration;
    private Time time;
}
