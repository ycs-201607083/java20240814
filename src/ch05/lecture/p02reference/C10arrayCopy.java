package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10arrayCopy {
    public static void main(String[] args) {
        int a[] = {6, 7, 8};
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 99;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
