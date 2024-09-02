package ch08.lecture.p03cast;

import ch08.lecture.p03cast.my_interface.MyInterface1;

public class MyClass1 implements MyInterface1 {
    @Override
    public void m1() {
        System.out.println("MyClass1.m1");
    }

    public void otherM() {
        System.out.println("MyClass1.getOtherClass");
    }
}
