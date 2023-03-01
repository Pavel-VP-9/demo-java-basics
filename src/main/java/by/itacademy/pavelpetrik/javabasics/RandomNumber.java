package by.itacademy.pavelpetrik.javabasics;

public class RandomNumber {
    public static void main(String[] args) {
        //В случае, если вещественное число, и верхний диапазон включает b - [a;b] :
        // ( Math.random() * (b - a + 1) + a
        //Если еще и только целые числа - (int)(( Math.random() * (b - a + 1) + a)
        // диапазон от 1000 до 1000 включительно
        int x = (int)(Math.random()*(2000+1))-1000;
        System.out.println(x);

    }
}
