package ch06.lecture.p09ecapsulation.qestion;

import ch06.sec13.exam03.package1.A;

import java.util.Scanner;

public class BackApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectNum;
        String backNum;
        String userName;
        int initMoney;
        boolean run = true;
        Account account = new Account();


        int count = 0;
        Account[] accounts = new Account[100];

        while (run) {
            System.out.println("=========================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("=========================");

            System.out.print("선택 > ");
            selectNum = scanner.nextLine();

            if (selectNum.equals("1")) {
                System.out.println("=========");
                System.out.println("계좌생성");
                System.out.println("=========");
                System.out.print("계좌번호 : ");
                backNum = scanner.nextLine();
                System.out.print("계좌주 : ");
                userName = scanner.nextLine();
                System.out.print("초기 입금액 : ");
                initMoney = Integer.parseInt(scanner.nextLine());
                System.out.println("계좌가 생성 되었습니다.");

                account = new Account(backNum, userName, initMoney);


                accounts[count] = account;

                count++;

            } else if (selectNum.equals("2")) {
                System.out.println("=========");
                System.out.println("계좌목록");
                System.out.println("=========");

                for (int i = 0; i < count; i++) {
                    String number = accounts[i].getBackNum();
                    String name = accounts[i].getUserName();
                    int money = accounts[i].getInitMoney();
                    System.out.println(number + "\t" + name + "\t" + money);
                }

            } else if (selectNum.equals("3")) {
                System.out.println("=========");
                System.out.println("예금");
                System.out.println("=========");
                System.out.println("계좌번호 : ");
                String num = (scanner.nextLine());
                System.out.print("예금액 :");
                int money = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < count; i++) {
                    String n = accounts[i].getBackNum();
                    if (num.equals(n)) {
                        int plusCurrent = accounts[i].getInitMoney() + money;

                        account.setInitMoney(plusCurrent);
                        System.out.println("일치계좌번호 : " + n);
                        System.out.println("현재금액 : " + plusCurrent);
                    }
                }
            } else if (selectNum.equals("4")) {
                System.out.println("=========");
                System.out.println("출금");
                System.out.println("=========");
                System.out.print("계좌번호 : ");
                String num = scanner.nextLine();
                System.out.print("출금액 : ");
                int money = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < count; i++) {
                    String n = accounts[i].getBackNum();

                    if (num.equals(n)) {
                        int minusCurrent = accounts[i].getInitMoney() - money;
                        account.setInitMoney(minusCurrent);
                        System.out.println("출금 계좌 : " + n);
                        System.out.println("출금액 : " + money);
                        System.out.println("출금 후 잔액 : " + minusCurrent);
                    }
                }

            } else if (selectNum.equals("5")) {
                System.out.println("종료");
                run = false;
            }


        }
    }
}
