package com.leetcode.majoritylementtwo;

import java.util.*;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * <p>
 * Note: The algorithm should run in linear time and in O(1) space.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,3]
 * Output: [3]
 * Example 2:
 * <p>
 * Input: [1,1,1,3,3,2,2,2]
 * Output: [1,2]
 */
public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>(nums.length / 2);
        Map<Integer, Integer> map = new HashMap<>();
        int threshold = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer currentQty = map.get(nums[i]);
                currentQty++;
                map.remove(nums[i]);
                map.put(nums[i], currentQty);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer n : map.keySet()) {
            if (map.get(n) > threshold) {
                result.add(n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
    }
}
