package com.sea.utils;

public class StrUtils {


    /**
     * 十六进制字节数组转十六进制字符串
     */
    public static String bytesToHeString(byte[] hexBytes){
        StringBuilder str = new StringBuilder();
        for (byte b : hexBytes) {
            str.append(String.format("%02X ", b));
        }
        String result = str.toString().trim();
        return result;
    }


    /**
     * 十六进制字符串转十六进制字节数组
     */
    public static byte[] hexStringToBytes(String hexString) {
        String[] hexValues = hexString.split(" ");
        byte[] hexBytes = new byte[hexValues.length];

        for (int i = 0; i < hexValues.length; i++) {
            hexBytes[i] = (byte) Integer.parseInt(hexValues[i], 16);
        }
        return hexBytes;
    }
}
