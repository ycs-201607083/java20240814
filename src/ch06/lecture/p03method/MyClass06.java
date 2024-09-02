package ch06.lecture.p03method;

import java.util.Arrays;

public class MyClass06 {
    public void m1(int a) {
        System.out.println(a);
    }

    public void m2(int[] a) {
        System.out.println(Arrays.toString(a));
        a[0] = 99;
    }
}
