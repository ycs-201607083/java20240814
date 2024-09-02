package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        boolean run = true;
//        int speed = 0;
//
//        while (run) {
//            System.out.println("===============================");
//            System.out.println("1.  증속 || 2.    감속|| 3.     중지");
//            System.out.println("===============================");
//            System.out.println("선택:");
//
//            String strNum = scanner.nextLine();
//
//            if (strNum.equals("1")) {
//                speed++;
//                System.out.println("현재속도 : " + speed);
//            } else if (strNum.equals("2")) {
//                speed--;
//                System.out.println("현재속도 : " + speed);
//            } else if (strNum.equals("3")) {
//                run = false;
//            }
//        }
//        System.out.println("종료");

        boolean a = true;
        int money = 0;
        while (a) {
            System.out.println("===========================");
            System.out.println("1.예금 | 2.출금 |3. 잔고 | 4.종료");
            System.out.println("===========================");
            System.out.println("선택>");

            String str = scanner.nextLine();

            if (str.equals("4")) {
                System.out.println("종료");
                a = false;
            } else if (str.equals("1")) {
                money += 1000;
                System.out.println("예금액 = " + money);
            } else if (str.equals("2")) {
                money -= 1000;
                System.out.println("출금액 = " + money);
            } else if (str.equals("3")) {
                System.out.println("잔고 = " + money);
            }
        }

    }
}
