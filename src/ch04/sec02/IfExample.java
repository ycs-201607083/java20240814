package ch04.sec02;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("등급:A");
            System.out.println("90보다 큼");
        }
        if (score < 90) {
            System.out.println("등급:B");
            System.out.println("90보다 작음");
        }
    }
}
