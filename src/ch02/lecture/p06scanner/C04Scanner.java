package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수1>");
        Double n1 = scanner.nextDouble();
        System.out.println("수1>");
        Double n2 = scanner.nextDouble();

        System.out.println("더한 값: " + (n1 + n2));
    }
}
