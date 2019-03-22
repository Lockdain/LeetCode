package com.leetcode.multiplystrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("0", 0);
    }

    public static String multiply(String num1, String num2) {
        long a = convert(num1);
        long b = convert(num2);
        long res = a * b;

        return String.valueOf(res);
    }

    public static long convert(String s) {
        long res = 0;

        if (s.length() == 0) {
            throw new IllegalArgumentException("Should not be empty string.");
        }

        // Если одно значение - просто вернём int из таблицы
        if (s.length() == 1) {
            res = map.get(s);
            return res;
        }

        // Контроль переполнения
        long prevRes = 0;
        // Множитель разрядов
        int multiply = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            long cur = map.get(String.valueOf(s.charAt(i)));
            prevRes = res;
            res += cur * multiply;
            if (res < prevRes) {
                throw new IllegalArgumentException("Long overflow has been detected");
            }
            multiply *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convert("6913259244"));
       // System.out.println(multiply("6913259244", "71103343"));
    }
}
