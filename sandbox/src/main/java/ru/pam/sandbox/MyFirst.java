package ru.pam.sandbox;

public class MyFirst {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexandr");

        Square s = new Square(5);

        Rectangle r = new Rectangle(2,3);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        System.out.println("Площадь прямоугольника со сторонами " + r.a + " and " + r.b + " = " + r.area());
    }


    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }




}
