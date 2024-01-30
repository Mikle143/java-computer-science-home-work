package ru.vdovinmb.home_work3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные
 * функции. main - только для тестирования написанного функционала.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 5, -5, -7, 3, 0, 0};
        System.out.println(Arrays.toString(delete(array)));
    }
    private static int[] delete(int[] array) {
        int lengt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                lengt++;
            }
        }
        int[] newArray = new int[lengt];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                newArray[j] = array[i] * newArray.length;
                j++;
            }
        }
        return newArray;
    }
}
