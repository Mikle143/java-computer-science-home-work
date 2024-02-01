package ru.vdovinmb.home_work2;

import java.util.Scanner;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр
 * (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("всего нечетных чисел: " + nechet(n));
        System.out.println("всего четных чисел: " + chet(n));
    }

    private static int nechet(int n) {
        int count1 = 0;
        System.out.println("Нечетные числа: ");
        while (n > 0) {
            int a = n % 10;
            n = n / 10;

            if (a % 2 != 0) {
                System.out.print(a + ", ");
                count1++;
            }
        }
        return count1;

    }

    private static int chet(int n) {
        int count2 = 0;
        System.out.println("Четные числа: ");
        while (n > 0) {
            int a = n % 10;
            n = n / 10;

            if (a % 2 == 0) {
                System.out.print(a + ", ");
                count2++;
            }
        }
        return count2;
    }
}
