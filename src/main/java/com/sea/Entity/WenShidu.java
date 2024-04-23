package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author 清醒
 * @Date 2024/4/19 15:03
 */

/**
 * 温湿度
 * */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class WenShidu {

    private int groupname;
    private int numbering;
    private double wendu;
    private double shidu;

}
