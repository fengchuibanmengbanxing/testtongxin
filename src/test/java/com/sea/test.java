package com.sea;

import java.util.HashSet;

/**
 * @Author 清醒
 * @Date 2024/6/9 20:57
 */
public class test {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        boolean add = hashset.add(1);
        boolean contains = hashset.contains(1);
        System.out.println(add);
        System.out.println(contains);
    }
}
