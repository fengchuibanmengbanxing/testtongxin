package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author 清醒
 * @Date 2024/4/27 11:58
 */

/***
 * 温度
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WenDu {
    private int groupName;
    private int numbering;
    private int wendu;
    private Time time;
}