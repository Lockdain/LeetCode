package com.leetcode.tasks.SortColors.Parenthesis;

import java.util.ArrayDeque;
import java.util.Objects;

public class Parenthesis {

    public static boolean isBalanced(String s) {
        if (Objects.isNull(s)) {
            throw new NullPointerException("String is null");
        }

        if (s.isEmpty()) {
            return true;
        }

        ArrayDeque<Character> stack = new ArrayDeque<>();

        int c = 0;
        do {
            char e = s.charAt(c);
            if (String.valueOf(e).equals("[")
                    || String.valueOf(e).equals("(")
                    || String.valueOf(e).equals("{")) {
                stack.push(e);
                c++;
            } else if (!stack.isEmpty() && String.valueOf(e).equals("]") && stack.peek().toString().equals("[")) {
                stack.pop();
                c++;
            } else if (!stack.isEmpty() && String.valueOf(e).equals(")") && stack.peek().toString().equals("(")) {
                stack.pop();
                c++;
            } else if (!stack.isEmpty() && String.valueOf(e).equals("}") && stack.peek().toString().equals("{")) {
                stack.pop();
                c++;
            } else {
                return false;
            }
        } while (c != s.length());
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isBalanced("(]"));
    }
}
