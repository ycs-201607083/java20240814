package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

       /* if (score >= 90) {
            System.out.println("90보다 큼");
        } else if (score > 80) {
            System.out.println("90보다 작음");
        } else if (score > 70) {
            System.out.println("80보다 작음");
        } else {
            System.out.println("점수미달");
        }
    }*/
        if (score > 20) {
            System.out.println("성인입니다.");
        } else if (score <= 19 && score >= 13) {
            System.out.println("청소년입니다.");
        } else if (score <= 12 && score >= 6) {
            System.out.println("어린이입니다.");
        } else if (score <= 5 && score >= 1) {
            System.out.println("유아입니다.");
        } else {
            System.out.println("나이를 잘못 입력");
        }
    }
}

