package by.itacademy.pavelpetrik.javabasics;

import java.util.Scanner;
//Задание 6
//Напишите программу, которая выводит в консоль “Hello, ИМЯ!”, где ИМЯ берется из
//командной строки.
public class ConsoleOutput {

    public static void main(String[] args) {
        Scanner userScan = new Scanner(System.in);
        System.out.println(" Inter your name: ");
        String nameUser = userScan.nextLine();
        System.out.println(" Hello " + nameUser);

    }

}

