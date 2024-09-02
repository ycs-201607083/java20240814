package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C07Polymorphism {
    public static void main(String[] args) {
        String a = "java";
        Scanner sc = new Scanner(System.in);
    }

    public static void print(Object o) {
        o.toString();
        int i = o.hashCode();

        System.out.println(o);
        System.out.println(i);
    }
}
