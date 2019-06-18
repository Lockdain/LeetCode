package com.leetcode.singlenumber;

import java.util.*;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class Main {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap(nums.length);
        for (int n : nums) {
            if (map.containsKey(n))
                map.remove(n);
            else
                map.put(n, 0);
        }
        return (int) map.keySet().toArray()[0];
    }

    public static void main(String[] args) {
        int[] nums = {17, 12, 5, -6, 12, 4, 17, -5, 2, -3, 2, 4, 5, 16, -3, -4, 15, 15, -4, -5, -6};
        System.out.println(singleNumber(nums));
    }
}
