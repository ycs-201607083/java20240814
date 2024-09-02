package ch05.lecture.p02reference;

import java.util.Arrays;

public class C04Matrix {
    public static void main(String[] args) {
        int n[][] = new int[3][];

        System.out.println("n =" + n.length);
        System.out.println("n =" + n[0]);
        System.out.println("n =" + n[1]);
        System.out.println("n =" + n[2]);
        System.out.println(Arrays.toString(n));

        n[0] = new int[3];
        n[1] = new int[]{11, 22, 33};
        n[2] = new int[]{99, 88, 77};

        System.out.println(n[1][0]);
        System.out.println(n[1][2]);
        System.out.println(n[2][1]);
    }
}
