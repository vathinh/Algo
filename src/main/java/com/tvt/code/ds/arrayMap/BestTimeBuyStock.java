package com.tvt.code.ds.arrayMap;

import java.util.Arrays;

public class BestTimeBuyStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        Arrays.stream(solution(prices)).forEach(System.out::println);
    }

    public static int[] solution(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        int minBuy = arr[0];
        int maxProf = 0;

        for(int i = 0; i < arr.length; i++) {
            if(minBuy > arr[i]) {
                minBuy = arr[i];
                minIndex = i;
            }
            if(arr[i] - minBuy > maxProf) {
                maxProf = arr[i] - minBuy;
                maxIndex = i;
            }
        }

        return new int[]{minIndex + 1, maxIndex + 1, maxProf};
    }
}
