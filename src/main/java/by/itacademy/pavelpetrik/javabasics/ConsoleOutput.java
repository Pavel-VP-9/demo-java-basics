package by.itacademy.pavelpetrik.javabasics;

import java.util.Scanner;

public class ConsoleOutput {

    public static void main(String[] args) {
        Scanner userScan = new Scanner(System.in);
        System.out.println(" Inter your name: ");
        String nameUser = userScan.nextLine();
        System.out.println(" Hello " + nameUser);

    }

}

