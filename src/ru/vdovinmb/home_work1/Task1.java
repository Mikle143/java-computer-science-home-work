package ru.vdovinmb.home_work1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {
        int minutes = 15;
        function(minutes);
    }

    private static void function(int min) {
        if (min >= 0 && min < 15) {
            System.out.println("число попадает в первую четверть часа");
        } else if (min >= 15 && min < 30) {
            System.out.println("число попадает во вторую четверть часа");
        } else if (min >= 30 && min < 45) {
            System.out.println("число попадает в третью четверть часа");
        } else if (min >= 45 && min < 60) {
            System.out.println("число попадает в четвертую четверть часа");
        } else System.out.println("Invalid minutes");
    }
}
