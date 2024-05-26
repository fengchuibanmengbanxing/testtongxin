package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 清醒
 * @Date 2024/4/27 12:04
 */

/**
 * 土壤
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Soil {
    private int groupName;
    private int numbering;
    private boolean isSoil;
}