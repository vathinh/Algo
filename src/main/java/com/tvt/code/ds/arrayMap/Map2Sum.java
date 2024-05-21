package com.tvt.code.ds.arrayMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map2Sum {

    public static void main(String[] args) {
        int [] test = new int[]{2,7,11,15};
        int target = 9;
        int[] res = solution(test, target);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer val = map.get(nums[i]);
            if(val != null) return new int[]{i, val};
            else map.put(target - nums[i], i);
        }

        return nums;
    }


    public static int[] solution1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer val = map.get(nums[i]);
            if(val != null) return new int[]{i, val};
            else map.put(target - nums[i], i);
        }

        return new int[]{1,2};
    }

}
