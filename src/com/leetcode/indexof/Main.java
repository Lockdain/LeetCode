package com.leetcode.indexof;

import java.util.Objects;

public class Main {
    public static int strStr(String haystack, String needle) {
        if (Objects.nonNull(needle) && needle.isEmpty()) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        if (needle.equals(haystack)) {
            return 0;
        }

        if (needle.length() == 1) {
            int gotcha = -1;
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    gotcha = i;
                    break;
                }
            }
            return gotcha;
        }

        int gotcha = 0;
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            if (i == haystack.length() - 1) {
                return -1;
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                gotcha = i;
                while (true) {
                    int m = i + 1;
                    int p = j + 1;
                    while (haystack.charAt(m) == needle.charAt(p)) {
                        if (p == needle.length() - 1)
                            return gotcha;
                        else {
                            p++;
                            m++;
                            if (m > haystack.length() - 1) {
                                return -1;
                            }
                        }
                    }
                    break;
                }
            } else {
                continue;
            }
        }
        return  gotcha;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "sippi"));
    }
}
