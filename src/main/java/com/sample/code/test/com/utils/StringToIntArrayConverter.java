package com.sample.code.test.com.utils;

import org.springframework.stereotype.Component;

@Component
public class StringToIntArrayConverter {
    public int[] getIntArray(String stepCombinations) throws Exception {
        String [] stringArr = stepCombinations.split(",");
        int [] intArray = new int[stringArr.length];
        for (int i =0;i<stringArr.length;i++){
            intArray[i] = Integer.parseInt(stringArr[i]);
        }
        return intArray;
    }
}
