package programers;

import java.util.Arrays;

public class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");

        int prev = Integer.parseInt(s[0]);

        for (int i = 1; i < s.length; i += 2) {
            String operator = s[i];

            switch (operator) {
                case "+" -> {
                    prev = prev + Integer.parseInt(s[i + 1]);
                }
                case "-" -> {
                    prev = prev - Integer.parseInt(s[i + 1]);
                }
            }
        }
        return prev;
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        System.out.println(num_list.length);
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer = answer + num_list[i];
            }
        } else {
            answer = 1;
            for (int i = 0; i < num_list.length; i++) {
                answer = answer * num_list[i];
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static int[] solu(int[] arr) {
        int[] answer = {};
        int result[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 | (arr[i] / 2) == 0) {
                result[i] = arr[i] / 2;
            } else if (arr[i] <= 50 | arr[i] / 3 != 0) {
                result[i] = arr[i] * 2;
            }
        }

        System.out.println(Arrays.toString(result));
        return answer;
    }
}
