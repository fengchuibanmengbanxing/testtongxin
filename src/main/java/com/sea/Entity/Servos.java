package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Servos {
    private int groupName;
    private int numbering;
    private int angle;
}
