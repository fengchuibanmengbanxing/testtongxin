package com.sea.Entity;

/**
 * @Author 清醒
 * @Date 2024/5/26 13:31
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

/**
 * 指纹
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FingerPrint {
    private int groupName;
    private int numbering;
    private String number;
}
