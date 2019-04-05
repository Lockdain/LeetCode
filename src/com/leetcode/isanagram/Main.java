package com.leetcode.isanagram;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public  boolean isAnagram(String s, String t) {
        if (null != s && s.equals(t))
            return true;

        if (s.length() != t.length())
            return false;

        Map<String, Letter> map1 = new HashMap<>(s.length());
        Map<String, Letter> map2 = new HashMap<>(t.length());

        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            if (map1.containsKey(key)) {
                map1.get(key).incrQ();
            } else {
                map1.put(key, new Letter(key));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            String key = String.valueOf(t.charAt(i));
            if (map2.containsKey(key)) {
                map2.get(key).incrQ();
            } else {
                map2.put(key, new Letter(key));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            if (map1.containsKey(key) && map2.containsKey(key)) {
                if (map1.get(key).getQuantity() == map2.get(key).getQuantity()) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    class Letter {
        public String letter;

        public int getQuantity() {
            return quantity;
        }

        public int quantity;

        public Letter(String letter) {
            this.letter = letter;
            this.quantity = 1;
        }

        public void incrQ() {
            quantity++;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isAnagram("aacc", "ccac"));
    }
}
