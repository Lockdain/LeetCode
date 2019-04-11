package com.leetcode.squaresofsortedarray;

import java.util.Arrays;

public class Main {
    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            // просматриваем все отрицательные элементы
            if (A[i] >= 0) {
                break;
            } else {
                // берем их модуль
                A[i] = Math.abs(A[i]);
            }
        }

        // пересортируем массив
        Arrays.sort(A);

        // возведем каждый элемент в степень 2
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
       // System.out.println(Arrays.toString(A));
        return A;
    }

    public static void main(String[] args) {
        int[] a = {-5, -2, 0, 1, 5, 6, 20};
        System.out.println(sortedSquares(a));
    }
}
