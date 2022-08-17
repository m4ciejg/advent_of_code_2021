package com.maciejg.leetCode75;

import java.util.Arrays;

public class Day1 {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
    }

    // 1480. Running Sum of 1d Array
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    //724. Find Pivot Index
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;

        for (int i = 0; i< nums.length; i++) {
            totalSum += nums[i];
        }
        // leftSum = 28 - (28 - 2)
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) leftSum = 0;
            else leftSum += nums[i - 1];
            rightSum = totalSum - nums[i] - leftSum;
                if (leftSum == rightSum) {
                    return i;
                }
        }
        return -1;
    }
}
