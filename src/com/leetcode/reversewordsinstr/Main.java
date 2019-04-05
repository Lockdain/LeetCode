package com.leetcode.reversewordsinstr;

import java.util.Objects;

public class Main {
    public static String reverseWords(String s) {
        if (Objects.isNull(s) || s.isEmpty()) {
            return "";
        } else {
            // single word
            if (!s.contains(" ")) {
                return s;
            }
            s = s.trim();
            StringBuilder sb = new StringBuilder(30);
            StringBuilder result = new StringBuilder(s.length());
            for (int i = s.length() - 1; i >= 0; i--) {
                // a whitespace found
                char c = s.charAt(i);
                if (32 == c) {
                    // have a previous word in sb
                    continue;
                } else {
                    int exI = i;
                    // is a char
                    while (32 != s.charAt(exI)) {
                        if (exI <= 0) {
                            break;
                        }
                        exI--;
                    }
                    sb.append(s.substring(exI, i + 1).trim()).append(" ");
                    i = exI;
                }
            }
            return sb.toString().trim();
        }


    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  a   java is   cool "));
    }
}
