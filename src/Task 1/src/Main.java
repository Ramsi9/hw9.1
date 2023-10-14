import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        System.out.println("Введите первое число:");
        a = inputDouble();
        System.out.println("Введите второе чилос:");
        b = inputDouble();

        sum();  //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }


    private static void divide() {
        //todo дописать логику и печать результата
        System.out.println("Деление");{
            System.out.println( a + "/" + b + "=" + (a/b) );}
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println("Вычитание");{
            System.out.println( a + "-" + b + "=" + (a - b) );}
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println("Умножение");{
            System.out.println( a + "*" + b + "=" + (a*b) );}
    }

    private static void sum() {
        System.out.println("Сложение");{
            System.out.println( a + "+" + b + "=" + (a + b) );}
    }

    private static double inputDouble() {
        return new Scanner(System.in).nextDouble();

    }
}
