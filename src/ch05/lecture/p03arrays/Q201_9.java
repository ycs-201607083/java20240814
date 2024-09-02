package ch05.lecture.p03arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q201_9 {
    public static void main(String[] args) {
        int score[] = new int[0];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=============================================");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("=============================================");
            System.out.print("선택>");
            String selectNum = scanner.nextLine();
            if (selectNum.equals("5")) {
                System.out.println("종료");
                break;
            } else if (selectNum.equals("1")) {
                int numOfStudent = scanner.nextInt();
                score = new int[numOfStudent];
                System.out.println("학생수> " + score.length);

            } else if (selectNum.equals("2")) {
                for (int i = 0; i < score.length; i++) {
                    System.out.println("scores[" + i + "]>");
                    score[i] = scanner.nextInt();

                }
                System.out.println("입력완료");

            } else if (selectNum.equals("3")) {
                for (int i = 0; i < score.length; i++) {
                    System.out.println((i + 1) + "번 째 학생 점수>" + score[i]);
                }
            } else if (selectNum.equals("4")) {
                int max = 0;
                double sum = 0;
                for (int i = 0; i < score.length; i++) {
                    if (max < score[i]) {
                        max = score[i];
                    }
                    sum += score[i];
                }
                double avg = sum / score.length;
                System.out.println("최고점수 : " + sum);
                System.out.println("평균점수 : " + avg);
            }
        }
    }
}
