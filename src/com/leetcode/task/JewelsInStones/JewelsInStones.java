package com.leetcode.task.JewelsInStones;

import java.util.HashMap;
import java.util.Map;

public class JewelsInStones {

    public static int numJewelsInStones(String j, String s) {
        int res = 0;

        String[] strArrJ = j.split("");
        String[] strArrS = s.split("");
        Map<Integer, String> hm = new HashMap<>();

        for (int i = 0; i < strArrJ.length; i++) {
            hm.put(i, strArrJ[i]);
        }

        for (String c : strArrS) {
            if (hm.containsValue(c)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("dds", "sssss"));
    }
}
