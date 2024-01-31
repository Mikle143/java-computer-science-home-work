package ru.vdovinmb.home_work3;

import java.util.Arrays;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:                        [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] ->    [0, 0]
 * <p>
 * [1, 9, 3]
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 0, 0, -5, -4} ;
        System.out.println(Arrays.deepToString(divide(array)));
    }

    private static int[][] divide(int[] array) {
        int[][] newArray = new int[3][];
        int n = 0;//длина массива newArray для a>0 newArray[0][n]
        int k = 0;//длина массива newArray для a<0 newArray[1][k]
        int l = 0;//длина массива newArray для a=0 newArray[2][l]
        for (int a : array) {
            if (a > 0) {
                n++;
            }
            if (a < 0) {
                k++;
            }
            if (a == 0) {
                l++;
            }
        }
        newArray[0] = new int[n];
        newArray[1] = new int[k];
        newArray[2] = new int[l];
        int j = 0;
        int g = 0;
        int h = 0;//переменные, по которым будем итерироваться в каждом из подмассивов
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                newArray[0][j] = array[i];
                j++;
            } else if (array[i] < 0) {
                newArray[1][g] = array[i];
                g++;
            } else if (array[i] == 0) {
                newArray[2][h] = array[i];
                h++;
            }
        }
        return newArray;
    }
}

