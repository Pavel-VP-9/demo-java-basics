package by.itacademy.pavelpetrik.javabasics;

import java.util.Scanner;

import static java.lang.reflect.Array.getInt;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);

    }
    // в методе int getInt() вводим число и проверяем его - введено или нет

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        //если число целочисленное, тогда присвоить введенное пользователем
        // значение в переменную num, если же не целочисленное, - вывести в консоль
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;

    }
    //Выбор операции (+,-,*,/) мы осуществили с помощью
    // метода char getOperation()

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия- атрибут позволяющий методу вызывать самого себя
            operation = getOperation();
        }
        return operation;

    }
    // в методе выбираем операцию +.-./.*

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}

