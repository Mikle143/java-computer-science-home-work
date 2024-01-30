package ru.vdovinmb.home_work2;

import java.util.Scanner;

/**
 Задание 2
 Дано целое число.
 Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 Результат вывести на консоль.
 Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

 Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(reverse(n));
    }
    private static int reverse(int n){
        int reverse=0;
        int znak=1;
        if (n<0){
            znak=-1;
        }
        n=Math.abs(n);
        while (n>0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        reverse=reverse*znak;
        return reverse;
    }
}

