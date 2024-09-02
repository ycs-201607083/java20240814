package ch06.lecture.p06final.class3;

import java.util.Arrays;

public class C03Final {
    public static void main(String[] args) {
        final int[] a = {3, 4};

        a[0] = 3;
        System.out.println(Arrays.toString(a));

        m1(a);
        System.out.println(Arrays.toString(a));
    }

    static void m1(final int a[]) {
        a[1] = 99;
    }
}
