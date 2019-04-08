package com.leetcode.selfdividingnumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left > 0 && left < 10 && right > 0 && right < 10 && left < right) {
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
            return result;
        }

        for (int i = left; i <= right; i++) {
            List<Integer> a = new ArrayList<>();
            if (i < 10) {
                // если меньше 10, то добавляем сразу
                result.add(i);
                continue;
            }
            // извлекаем список цифр из числа
            getNumList(i, a);

            if (a.contains(0)) {
                // числа, содержащие 0 - пропускаем
                continue;
            } else {
                // флаг - т. е. не все числа прошли проверку на делитель
                boolean breakFlag = false;
                // проверяем, что число делится на каждое из составляющих его чисел
                for (int j = 0; j < a.size(); j++) {
                    if (i % a.get(j) == 0) {
                        continue;
                    } else {
                        breakFlag = true;
                        break;
                    }
                }
                // если флаг - проверяем следующее число из диапазона
                if (breakFlag) {
                    continue;
                } else {
                    // подходящее число
                    result.add(i);
                }
            }
        }

        return result;
    }

    private static void getNumList(int n, List<Integer> r) {
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
        System.out.println(selfDividingNumbers(1, 15));
    }
}
