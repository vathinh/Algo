package com.tvt.code.ds.arrayMap;

import java.util.Arrays;

public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,10,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
//        System.out.println(solution(arr));

    }
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }


    public static int solution(int[] arr) {
        int curr = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(curr, max);
        }


        return max;
    }


    public static int sum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
