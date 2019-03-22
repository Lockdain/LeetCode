package com.leetcode.longestcommonprefix;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        // Ищем самое короткое слово в массиве
        String shortest = "";
        List<String> list = new LinkedList<>(Arrays.asList(strs)).stream().distinct().collect(Collectors.toList());
        Iterator<String> iter1 = list.iterator();
        Optional<String> min = list.stream().min(Comparator.comparingInt(String::length));

        if (min.isPresent()) {
            shortest = min.get();
        }

        while (iter1.hasNext()) {
            if (iter1.next().equals(shortest)) {
                iter1.remove();
            }
        }


        boolean contains = true;

        while (contains) {
            if (list.isEmpty()) {
                return shortest;
            }
            int counter = 0;
            Iterator<String> iter = list.iterator();
            while (iter.hasNext()) {
                String s = iter.next();
                if (shortest.equals(s)) {
                    iter.remove();
                    if (list.isEmpty()) {
                        return shortest;
                    }
                    continue;
                }
                if (!s.startsWith(shortest)) {
                    shortest = shortest.substring(0, shortest.length() - 1);
                    if ("".equals(shortest)) {
                        return "";
                    }
                } else {
                    counter++;
                    if (counter == list.size()) {
                        return shortest;
                    } else {
                        continue;
                    }
                }
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
