package com.leetcode.stringcompression;

/**
 * Given an array of characters, compress it in-place.
 * <p>
 * The length after compression must always be smaller than or equal to the original array.
 * <p>
 * Every element of the array should be a character (not int) of length 1.
 * <p>
 * After you are done modifying the input array in-place, return the new length of the array.
 * <p>
 * <p>
 * Follow up:
 * Could you solve it using only O(1) extra space?
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * ["a","a","b","b","c","c","c"]
 * <p>
 * Output:
 * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * <p>
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * ["a"]
 * <p>
 * Output:
 * Return 1, and the first 1 characters of the input array should be: ["a"]
 * <p>
 * Explanation:
 * Nothing is replaced.
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input:
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * <p>
 * Output:
 * Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * <p>
 * Explanation:
 * Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
 * Notice each digit has it's own entry in the array.
 */

public class Main {
    public static int compress(char[] chars) {
        char cur = chars[0];
        int firstFindIndex = 0;
        int curCounter = 1;
        int printed = 0;
        // счетчик
        int j = 0;
        // если массив содержит один элемент
        if (chars.length == 1) {
            return 1;
        }

        while (true) {
            // если проверили все элементы - можно выходить
            if (j >= chars.length - 1) {
                break;
            }
            // "обнуляем" счетчик количества вхождений
            curCounter = 1;
            // если следующий элемент равен предыдущему
            while (j + 1 < chars.length && chars[j + 1] == cur) {
                // увеличиваем счетчик
                curCounter++;
                j++;
            }
            // запоминаем новый элемент
            if (j + 1 < chars.length) {
                cur = chars[j + 1];
            }

            if (curCounter < 10 && curCounter > 1) {
                // символ встречается меньше 10 раз, но больше 1
                chars[++printed] = String.valueOf(curCounter).charAt(0);
                // запоминаем указатель последней записи количества
                printed++;
            }

            // найдено только одно вхождение
            if (curCounter == 1) {
                printed++;
            }

            if (curCounter > 10) {
                for (int i = 0; i < String.valueOf(curCounter).length(); i++) {
                    chars[++printed] = String.valueOf(curCounter).charAt(i);
                }
                // запоминаем указатель последней записи количества
                printed++;
            }

            // смещаем указатель
            j++;
        }
        System.out.println(chars);
        return printed;
    }

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(array));
        //compress(array);
    }
}
