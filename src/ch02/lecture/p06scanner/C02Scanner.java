package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름>");
        String name = scanner.nextLine();

        System.out.println("나이>");
        String age = scanner.nextLine();

        String desc = name + "님의 나이는" + age + "세 입니다.";
        System.out.println(desc);

    }
}
