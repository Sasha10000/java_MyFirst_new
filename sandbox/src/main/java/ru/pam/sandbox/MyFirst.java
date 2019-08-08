package ru.pam.sandbox;

public class MyFirst {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexandr");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 2;
        double b = 3;
        System.out.println("Площадь прямоугольника со сторонами " + a + " and " + b + " = " + area(a,b));
    }


    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;

    }

    public static double area(double a, double b) {
        return a*b;

    }
}
