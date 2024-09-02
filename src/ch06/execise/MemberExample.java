package ch06.execise;

import java.util.Arrays;

public class MemberExample {
    public static void main(String[] args) {
        MemberService a = new MemberService();
        Member s = new Member();

        System.out.println(s.id);
        System.out.println(s.age);
        System.out.println(s.password);
        System.out.println(s.name);

        a.login("hong", "12345");
        a.logout();

        a.println(1);
        a.println("S");
        a.println(0.1);
        a.println(true);

        int sss[] = new int[]{1, 2, 3, 4, 5, 1, 3, 2, 1};
        System.out.println("=================");
        System.out.println(Arrays.toString(solution(sss)));

    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
