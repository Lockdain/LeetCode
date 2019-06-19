package com.leetcode.findcommoncharacters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindCommonChars {

    public static List<String> commonChars(String[] A) {
        HashSet<Character> hashSetList = new HashSet<>();
        // find the longest word
        int maxLength = 0;
        int maxIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A.length > maxLength) {
                maxLength = A[i].length();
                maxIndex = i;
            }
        }
        for (char ch : A[maxIndex].toCharArray()) {
            hashSetList.add(ch);
        }
        for (String s : A) {
//            hashSetList.retainAll();
        }
        System.out.println(hashSetList);
        return null;
    }

    public static void main(String[] args) {
        commonChars(new String[]{"bella", "label", "roller"});
    }
}
