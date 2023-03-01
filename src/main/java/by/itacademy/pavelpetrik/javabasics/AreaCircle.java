package by.itacademy.pavelpetrik.javabasics;

import java.util.Scanner;
//HW-8. Написать метод, определяющий площадь круга с радиусом R.

public class AreaCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Введите значение радиуса круга : ");
        double radius = scan.nextDouble();
        // Площадь круга
        double area = Math.PI*radius*radius;
        System.out.println(" Площадь круга: " + area);
        //Длина окружности
        double circumference = Math.PI*2*radius;
        System.out.println(" Длина окружности: " + circumference);

    }
}
