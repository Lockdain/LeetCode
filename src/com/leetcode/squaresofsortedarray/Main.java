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
//        int[] a = {-5, -2, 0, 1, 5, 6, 20};
//        System.out.println(sortedSquares(a));

        System.out.println(accountKeyingValidation("40702810538060216028", "044525225"));
    }

    protected static boolean accountKeyingValidation(String account, String BIC) {
        final String METHOD_NAME = "accountKeyingValidation";

        if (account != null && BIC != null && account.length() != 20
                || !BIC.matches("^[0-9]+$")) {
            return false;
        }
        int length = BIC.length();
        String tempAcc;
        if("00".equals(BIC.substring(length - 3, length-1))){
            tempAcc = "0" + BIC.substring(length - 5, length-3) + account;
        } else {
            tempAcc = BIC.substring(length - 3, length) + account;
        }

        int[] controlArray = { 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7,
                1, 3, 7, 1, 3, 7, 1 };
        int sumResult = 0;
        for (int i = 0; i < 23; i++) {
            sumResult += controlArray[i]
                    * Character.getNumericValue(tempAcc.charAt(i));
        }
        if (sumResult % 10 == 0) {
            return true;
        }
        return false;
    }

}
