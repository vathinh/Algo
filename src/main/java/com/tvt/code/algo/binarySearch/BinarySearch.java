package com.tvt.code.algo.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        System.out.println(solution(nums, target));
    }

    public static int solution(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while(first < last) {
            int mid = first + (last - first) / 2;
            if(nums[mid] == target) return mid;
            else  if(nums[mid] > target) {
                last = mid;
            } else {
                first = mid;
            }
        }
        return 0;

    }
}
