package com.leetcode.dividetwointegers;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 *
 * Return the quotient after dividing dividend by divisor.
 *
 * The integer division should truncate toward zero.
 *
 * Example 1:
 *
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Example 2:
 *
 * Input: dividend = 7, divisor = -3
 * Output: -2
 */
public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
        return dividend >>> divisor;
    }

    public static void main(String[] args) {
        System.out.println(divide(5, 1));

    }
}
