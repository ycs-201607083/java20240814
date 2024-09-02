package ch05.lecture.p02reference;

import java.util.Arrays;

public class C12MatrixCopy {
    public static void main(String[] args) {
        int[][] m1 = new int[][]{{12, 23, 32}, {23, 25, 14}};

        int[][] m2 = new int[m1.length][];

        for (int i = 0; i < m1.length; i++) {
            int[] row = new int[m1[i].length];
            for (int j = 0; j < m1[i].length; j++) {
                row[j] = m1[i][j];
            }
            m2[i] = row;
        }
        System.out.println("복사후 m2");
        System.out.println(Arrays.toString(m2[0]));
        System.out.println(Arrays.toString(m2[1]));
        m2[0][0] = 1010;
        System.out.println(m1[0][0]);

        System.out.println("m2[0][0]을 1010으로 바꾼 후 m2");
        System.out.println(Arrays.toString(m2[0]));
        System.out.println(Arrays.toString(m2[1]));
    }
}
