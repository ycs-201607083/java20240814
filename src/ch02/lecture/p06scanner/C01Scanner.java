package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 >");
        String a = scanner.nextLine();
        
        System.out.println("a = " + a);
    }
}
