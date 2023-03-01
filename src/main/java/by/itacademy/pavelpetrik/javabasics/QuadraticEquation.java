package by.itacademy.pavelpetrik.javabasics;

import java.util.Scanner;
//HW-8. Найти действительные корни квадратного уравнения a*x^2+b*x+c=0
//Корректно обработать случай, когда дискриминант равен нулю и когда дискриминант
//Отрицательный
public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите значение а: ");
        double a = scanner.nextDouble();
        System.out.println(" Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.println(" Введите значение c: ");
        double c = scanner.nextDouble();
        // дискриминант
        double d = b * b - 4 * a * c;
        System.out.println(" значение дискриминанта d: " + d);
        //Если d>0, то два решения (Х1 и Х2)
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения при d>0:" + " x1= " + x1 + " x2=" + x2);
            //Если d=0, то одно решение (Х1=X2)
        } else if (d == 0) {
            double x1 = (-b) / (2 * a);
            System.out.println("Корень уравнения при d=0:" + " x1= " + x1);
        }
        //Если d<0, то решений нет
        else  {
            System.out.println(" Решений нет ");
        }




    }
}
