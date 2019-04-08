package com.leetcode.parenthesisbalancing;

import java.util.ArrayDeque;
import java.util.Objects;

public class Parenthesis {

    /**
     * Метод проверяет, является ли входная последовательность скобок сбалансированной.
     *
     * @param s
     * @return
     */
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

    /**
     * Реализация метода для сайта stepik
     *
     * @param s
     */
    public static void isBalanced(String[] s) {
        if (Objects.isNull(s)) {
            throw new NullPointerException("String is null");
        }

        if (s.length == 0) {
            System.out.println("Success");
            return;
        }

        if (s.length == 1) {
            System.out.println("1");
            return;
        }

        ArrayDeque<String> stack = new ArrayDeque<>();

        int c = 0;
        do {
            String e = s[c];
            if (String.valueOf(e).equals("[")
                    || String.valueOf(e).equals("(")
                    || String.valueOf(e).equals("{")) {
                stack.push(e);
                c++;
            } else if (!stack.isEmpty() && String.valueOf(e).equals("]") && stack.peek().equals("[")) {
                stack.pop();
                c++;
            } else if (!stack.isEmpty() && String.valueOf(e).equals(")") && stack.peek().equals("(")) {
                stack.pop();
                c++;
            } else if (!stack.isEmpty() && String.valueOf(e).equals("}") && stack.peek().equals("{")) {
                stack.pop();
                c++;
            } else {
                System.out.println(++c);
                return;
            }
        } while (c != s.length);
        if (stack.isEmpty())
            System.out.println("Success");
    }


    public static void main(String[] args) {
//        isBalanced(new String[]{"(", ")", "[", "]", "}", "}"});
//        isBalanced(new String[]{"(", "[", "]", "(", ")", "{", "(", "[", "]", ")", "}", ")"});
//        isBalanced(new String[]{"{", "{", "[", "(", ")", "]", "]"});
//        isBalanced(new String[]{"(", ")", "[", "]", "}"});


    }
}

