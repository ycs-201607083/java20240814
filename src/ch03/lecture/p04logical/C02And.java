package ch03.lecture.p04logical;

import java.io.Console;
import java.util.Scanner;

public class C02And {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("나이입력>");
        int age = scanner.nextInt();

        if (age < 20 && age > 13) {
            System.out.println("청소년");
        } else {
            System.out.println("청소년 x");
        }
    }
}
