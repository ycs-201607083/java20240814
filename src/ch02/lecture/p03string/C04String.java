package ch02.lecture.p03string;

import javax.swing.*;

public class C04String extends JFrame {
    public static void main(String[] args) {
        String a = "길동";
        String b = "의적";

        String c = a + b;
        System.out.printf("c = " + c);

        String d = "3";
        String e = "5";

        String f = d + e;
        System.out.printf("f = " + f);

        String g = "흥민";
        String h = "토트넘";
        String i = g + "의 팀은" + h + "팀 이다";
        System.out.printf(i);

        String j = "3" + 5;

        System.out.printf(String.valueOf(Integer.parseInt(f)));
    }
}
