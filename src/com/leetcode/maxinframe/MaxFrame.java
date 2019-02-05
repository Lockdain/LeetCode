package com.leetcode.maxinframe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxFrame {

    /**
     * Returns the maximum value within frame of 3 in a subarray.
     * @param n
     * @param f
     * @return
     */
    public static int[] findMax(int[] n) {
        int[] res = new int[n.length - 2];
        if (n.length == 0) {
            res[0] = 0;
            return res;
        }

        if (n.length == 1) {
            res[0] = n[0];
            return res;
        }

        if (n.length == 2) {
            int max = n[0] >= n[1] ? n[0] : n[1];
            res[0] = max;
            return res;
        }

        int c = 0;
        for (int i = 0; i < n.length - 2; i++) {
            res[c] = (max(n[i], n[i + 1], n[i + 2]));
            c++;
        }

        return res;
    }

    /**
     * Returns the maximum between three integers.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int max(int a, int b, int c) {
        int max = a;

        max = (a >= b) ? a : b;
        max = (max >= c) ? max : c;

        return max;
    }

    public static void main(String[] args) {
        String x = Arrays.toString(findMax(new int[]{5, 1, 3, 2, 4, 6, 1, 7, 3, 2, 8}));
        System.out.println(x);
    }
}
