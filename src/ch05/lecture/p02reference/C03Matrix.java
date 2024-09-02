package ch05.lecture.p02reference;

import java.util.Arrays;

public class C03Matrix {
    public static void main(String[] args) {
        int m1[][] = new int[3][2];

        //[0,0]
        //[0,0]
        //[0,0]

        m1[0][0] = 30;
        m1[0][1] = 20;
        m1[1][1] = 10;

        m1[1][0] = 31;
        m1[1][1] = 31;

        m1[2][0] = 33;
        m1[2][1] = 34;

        System.out.println(Arrays.toString(m1[0]));
        System.out.println(Arrays.toString(m1[1]));
        System.out.println(Arrays.toString(m1[2]));
        System.out.println(m1.length);

    }
}
