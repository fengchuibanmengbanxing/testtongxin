package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

/**
 * @Author 清醒
 * @Date 2024/5/26 13:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ID_card {
    private int groupName;
    private int numbering;
    private String cardNumber;
}
