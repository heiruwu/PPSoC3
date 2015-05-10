package com.ppsoclab.ppsoc3;

import android.util.Log;

/**
 * Created by heiruwu on 5/8/15.
 */
public class ByteParse {
    private static String byteToString(byte b){
        return ""
                + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)
                + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)
                + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)
                + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);
    }

    public static int sIN16FromByte(byte input){
        String temp = byteToString(input);
//        String hsbString = temp.substring(0,3);
//        String lsbString = temp.substring(4,7);
//        int i = 10*((short)Integer.parseInt(hsbString,16))+((short)Integer.parseInt(lsbString,16));
        return Integer.parseInt(temp,2);
    }
}