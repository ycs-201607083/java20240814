package ch03;

import java.util.Scanner;

public class sec07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int charCode = scanner.nextInt();
        int charCode = 'B';
        if ((charCode >= 65) && (charCode <= 90)) {
            System.out.println("대문자");
        }
        if ((charCode <= 122) && (charCode >= 97)) {
            System.out.println("소문자");
        }
        if ((charCode >= 48) && (charCode <= 57)) {
            System.out.println("0~9 숫자");
        }

        int value = 6;

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2또는 3의 배수");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2또는 3의 배수 아님");
        }
    }
}
