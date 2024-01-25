package ru.vdovinmb.home_work1;

/**
 Задание 2

 Даны 3 переменные:

 - operand1 (double)
 - operand2 (double)
 - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)

 Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 Протестировать функцию в main.

 Например:
 Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {
    public static void main(String[] args) {
        double operand1=5.0;
        double operand2=3.0;
        char operation='/';
        function(operand1,operand2,operation);
    }
    public static void function (double op1, double op2, char operation){
        switch (operation){
            case '+'-> System.out.println(op1+op2);
            case '-'-> System.out.println(op1-op2);
            case '*'-> System.out.println(op1*op2);
            case '/'-> System.out.println(op1/op2);
            case '%'-> System.out.println(op1%op2);
            default -> System.out.println("Invalid operation");
        }
    }
}
