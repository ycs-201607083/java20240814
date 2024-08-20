package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C07Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 수를 한줄에 띄워서 입력");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        System.out.println("더한 값 = " + (n1 + n2));
    }
}
