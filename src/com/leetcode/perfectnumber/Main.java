package com.leetcode.perfectnumber;

/**
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
 *
 * Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
 * Example:
 * Input: 28
 * Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * Note: The input number n will not exceed 100,000,000. (1e8)
 */

public class Main {
    public static boolean checkPerfectNumber(int num) {

        // сумма чисел-делителей
        int s = 0;

        for (int i = 1; i < num ; i++) {
            // если делится без остатка
            if (num % i == 0) {
                // то это - делитель, добавляем его в сумму
                s += i;
            } else {
                // ищем следующее
                continue;
            }
        }

        return num == s;
    }

    // Проверяем только sqrt(num)
    public static boolean checkPerfectNumberSqrt(int num) {
        if (num == 0)
            return false;

        // сумма чисел-делителей
        int s = 0;

        for (int i = 1; i * i <= num ; i++) {
            // если делится без остатка
            if (num % i == 0) {
                // то это - делитель, добавляем его в сумму
                s += i;
                if (i * i != num) {
                    s += num / i;
                }
            } else {
                // ищем следующее
                continue;
            }
        }

        return s - num == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(56));
    }
}
