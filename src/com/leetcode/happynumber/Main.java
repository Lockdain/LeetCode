package com.leetcode.happynumber;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean isHappy(int n) {
        // для поразрядной записи числа
        List<Integer> r = new ArrayList<>();

        // счётчик глубины цикла
        int counter = 0;

        // переменная суммы квадратов чисел
        int s = 0;

        getList(n, r);

        while (s != 1){
            counter++;
            for (Integer c : r) {
                s += c * c;
            }
            if (s == 1) {
                return true;
            } else {
                if (counter >= 50) {
                    return false;
                }
                r.clear();
                getList(s, r);
                s = 0;
            }
        }
        return false;
    }

    private static void getList(int n, List<Integer> r) {
        if (n >= 10) {
            while (n > 0) {
                int k = n % 10;
                if (k != 0) {
                    n = n / 10;
                    r.add(k);
                    if (n < 10) {
                        r.add(n);
                        break;
                    }
                } else {
                    n = n / 10;
                    r.add(0);
                    if (n < 10) {
                        r.add(n);
                        break;
                    }
                }
            }
        } else {
            r.add(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(5));
    }

}
