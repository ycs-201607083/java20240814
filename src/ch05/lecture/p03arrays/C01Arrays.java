package ch05.lecture.p03arrays;

import java.lang.reflect.AnnotatedArrayType;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {
        int[] a = {5, 6, 7};

        System.out.println(Arrays.toString(a));

        int b[][] = {{4, 5}, {2, 1}};
        System.out.println(Arrays.deepToString(b));

        int c[][] = {{4, 5}, {2, 1}, {23, 12}};
        System.out.println(Arrays.deepToString(b));

        int[] d = {100, 200};
        int[] e = Arrays.copyOf(d, d.length);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));

        System.out.println(d == e);

        int[][] f = {
                {5, 2}, {2, 1},
                {2, 3}, {1, 2}
        };
        int[][] g = Arrays.copyOf(f, f.length);
        System.out.println(Arrays.deepToString(f));
        System.out.println(Arrays.deepToString(g));
        g[0][0] = 55;
        System.out.println(Arrays.deepToString(f));
        System.out.println(Arrays.deepToString(g));

    }
}
