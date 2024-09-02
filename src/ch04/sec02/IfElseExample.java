package ch04.sec02;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("90보다 큼");
        } else {
            System.out.println("90보다 작음");
        }
    }
}
