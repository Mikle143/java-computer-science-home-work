package ru.vdovinmb.home_work3;

import java.util.Arrays;

/**
 * Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа
 * (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и
 * вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] array = new char[]{'s', '4', 'f', 'F', '+'};
        System.out.println(Arrays.toString(convert(array)));
        System.out.println(Arrays.toString(arithmeticMean(convert(array))));
    }

    private static int[] convert(char[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (int) array[i];
        }
        return newArray;
    }

    private static int[] arithmeticMean(int[] array) {
        int summ = 0; //Сумма элементов переданного массива
        double aM = 0;//среднее арифметическое

        int[] finalArray;//Массив из элементов > среднего арифметического
        int j = 0;
        int finalArrayLengt = 0;
        for (int a : array) {
            summ += a;
        }
        aM = summ / array.length;
        System.out.println("Среднее арифметическое: " + aM);
        for (int a : array) {
            if (a > aM) {
                finalArrayLengt++;
            }
        }
        finalArray = new int[finalArrayLengt];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > aM) {   //если элемент массива > среднего арифметического
                finalArray[j] = array[i];
                j++;
            }
        }
        return finalArray;
    }
}
