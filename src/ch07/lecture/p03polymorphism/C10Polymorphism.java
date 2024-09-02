package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C10Polymorphism {
    public static void main(String[] args) {
        Object a = m1();
        String s = a.toString();
        System.out.println("s = " + s);
    }

    public static Object m1() {
        double r = Math.random();

        if (r < 0.5) {
            return "java";
        }
        return new Scanner(System.in);
    }
}
