package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author 清醒
 * @Date 2024/6/9 13:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Co {
    private int groupName;
    private int numbering;
    private int concentration;
    private Time time;
}
