package ch06.lecture.p03method;

import java.util.Arrays;

public class MyClass08 {
    public void m1() {
        System.out.println("같은 일");
    }

    public void m1(int a) {
        System.out.println(a);
    }

    public void m1(int a, int b) {
        System.out.println(a + b);
    }

    public void m1(int... a) {
        System.out.println("a.length = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
