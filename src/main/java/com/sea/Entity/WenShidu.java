package com.sea.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Time;

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
@Builder
public class WenShidu {

    private int groupName;
    private int numbering;
    private int wendu;
    private int shidu;
    private Time time;
}
