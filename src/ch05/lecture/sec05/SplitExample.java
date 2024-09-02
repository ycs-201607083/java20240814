package ch05.lecture.sec05;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다., 홍길동";

        //문자여ㅑㄹ 분리
        String tokens[] = board.split(",");

        //인덱스 별 읽기
        System.out.println("번호 :" + tokens[0]);
        System.out.println("제목 :" + tokens[1]);
        System.out.println("내용 :" + tokens[2]);
        System.out.println("성명 :" + tokens[3]);
        System.out.println();

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        solution("3+7");
    }

    public static int solution(String my_string) {
        int answer = 0;

        String arr[] = new String[my_string.length()];
        int begin = 0;
        int index = 0;
        int end = 0;

        while (begin < my_string.length()) {
            arr[index] = my_string.substring(begin, end);
            if (end > my_string.length()) {
                end = my_string.length();
            }

            begin++;
            end++;
            index++;
            System.out.println(Arrays.toString(arr));
        }

        return answer;
    }
}
