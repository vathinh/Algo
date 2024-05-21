package com.tvt.code.ds.arrayMap;

public class LargestValues {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 15}; // Example array of integers
        int[] largestValues = findSecondAndThirdLargest(numbers);
        System.out.println("Second largest value: " + largestValues[0]);
        System.out.println("Third largest value: " + largestValues[1]);
    }

    public static int[] findSecondAndThirdLargest(int[] nums) {
        // Check if array length is less than 2
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array should contain at least 2 elements.");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // Find the largest, second largest, and third largest values
        for (int num : nums) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != secondLargest && num != firstLargest) {
                thirdLargest = num;
            }
        }

        // Return the second and third largest values
        return new int[]{secondLargest, thirdLargest};
    }
}
