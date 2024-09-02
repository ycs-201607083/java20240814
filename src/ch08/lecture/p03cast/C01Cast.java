package ch08.lecture.p03cast;

import ch08.lecture.p03cast.my_interface.MyInterface1;

public class C01Cast {
    public static void main(String[] args) {
        MyInterface1 a = new MyClass1();
        a.m1();

        MyClass1 s = (MyClass1) a;
        s.otherM();
    }
}
