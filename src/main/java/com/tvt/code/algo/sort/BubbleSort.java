package com.tvt.code.algo.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] testArr = new int[]{0,45,1,2,4,90};
        Arrays.stream(bubbleSort(testArr)).forEach(System.out::println);

    }

    public static int[] bubbleSort(int[] intArr) {
        for(int i = 0; i < intArr.length - 1; i++) {
            for(int j = 0; j < intArr.length - i - 1; j++) {
                if(intArr[j] > intArr[j+1]) {
                    int temp = intArr[j+1];
                    intArr[j+1] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        return intArr;
    }
}
