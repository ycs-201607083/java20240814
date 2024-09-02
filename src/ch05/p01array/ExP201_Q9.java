package ch05.p01array;

import java.util.Arrays;
import java.util.Scanner;

public class ExP201_Q9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int student[] = new int[0];
        int score[] = new int[0];
        boolean run = true;
        while (run) {
            System.out.println("=============================================");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("=============================================");
            System.out.print("선택>");
            String selectNum = scanner.nextLine();
            switch (selectNum) {
                case "1" -> {
                    System.out.print("학생수는 몇명 인가요??");
                    int numOfStudent = scanner.nextInt();
                    student = new int[numOfStudent];
                    System.out.println("학생수 >" + student.length + "명");
                }
                case "2" -> {
                    score = student;
                    for (int i = 0; i < score.length; i++) {
                        System.out.println("score[" + (i + 1) + "]");
                        int scoreValue = scanner.nextInt();
                        score[i] = scoreValue;
                    }
                }
                case "3" -> {
                    for (int i = 0; i < score.length; i++) {
                        System.out.println("score[" + (i + 1) + "]:" + score[i]);
                    }
                }
                case "4" -> {
                    int sum = 0;
                    double avg = 0;
                    int max = 0;

                    for (int i = 0; i < score.length; i++) {
                        if (max < score[i]) {
                            max = score[i];
                        }
                        sum += score[i];
                    }
                    avg = sum / score.length;
                    System.out.println("최고점수 : " + max);
                    System.out.println("평균점수 : " + avg);
                }
                case "5" -> {
                    System.out.println("종료");
                    run = false;
                }
            }
        }
    }


}
