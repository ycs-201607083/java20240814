package ch03.lecture.p04logical;

import java.util.Scanner;

public class C03Or {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력>");
        int num = scanner.nextInt();

        boolean result = (num % 2 == 0) || (num % 5 == 0);
        if (result) {
            System.out.println("2또는 5의 배수");
        } else {
            System.out.println("2또는 5의 배수x");
        }
    }
}
