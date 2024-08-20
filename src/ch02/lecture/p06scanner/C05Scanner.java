package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력>");

        String line1 = scanner.nextLine();

        System.out.println("line1 = " + line1);

        System.out.println("3단어 이상 입력>");

        String t1 = scanner.next();
        String t2 = scanner.next();
        String t3 = scanner.next();

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
    }
}
