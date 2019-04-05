package com.leetcode.repeatedsubstring;

import java.util.Objects;

public class Main {
    public static boolean repeatedSubstringPattern(String s) {
        if (null != s && s.isEmpty()) {
            return false;
        }

        if (s.length() == 3 && s.charAt(0) != s.charAt(2)) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            if (j > s.length()) {

            }
            if (s.charAt(i) != s.charAt(j)) {
                sb.append(s.charAt(j));
            } else {
//                if (sb.charAt())
            }
        }

        return true;
    }

    public static boolean pattern(String str) {
        String s = str + str;
        return s.substring(1, s.length() - 1).contains(str);
    }

    public static void main(String[] args) {
//        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(pattern("ababab"));
    }
}
