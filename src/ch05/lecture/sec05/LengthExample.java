package ch05.lecture.sec05;

import java.util.Arrays;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "2131412312312";
        int length = ssn.length();

        if (length == 13) {
            System.out.println("주민번호 자릿수 일치");
        } else {
            System.out.println("놉");
        }

        myStr("qwertyuiopasdfghjklzxcvbnm", 6);

    }

    public static void myStr(String my_str, int n) {
        int l = my_str.length() / n;
        String arr[] = new String[l];
        System.out.println("길이 :" + my_str.length());
        if (my_str.length() % n != 0) {
            l++;
        }


        int begin = 0;
        int index = 0;
        int end = 0;

        while (begin < my_str.length()) {
            if (end > my_str.length()) {
                end = my_str.length();
            }

            arr[index] = my_str.substring(begin, end);
            index++;
            begin += n;
            end += n;
        }
    }
}
