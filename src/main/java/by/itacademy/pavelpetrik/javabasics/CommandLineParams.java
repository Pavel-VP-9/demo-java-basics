package by.itacademy.pavelpetrik.javabasics;
//Модифицировать код программы так, чтобы параметры командной строки выводились в
//обратном порядке.
public class CommandLineParams {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Общее количество аргументов" + args.length);
        int f=5;
        for( int i=0; i< args.length; i++ ){
            System.out.println(" Argument" + i + " = " + args[i]);
        }
    }


}
