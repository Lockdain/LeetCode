package com.leetcode.majorityelement;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> sortedMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sortedMap.containsKey(nums[i])) {
                Integer currentQty = sortedMap.get(nums[i]);
                currentQty++;
                // maybe we've already found it?
                if (currentQty > nums.length / 2) {
                    return nums[i];
                }
                sortedMap.remove(nums[i]);
                sortedMap.put(nums[i], currentQty);
            } else {
                sortedMap.put(nums[i], 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{0, 85, 16, 16, 23, 35, 16, 16, 16}));
    }
}
