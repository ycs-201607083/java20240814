package ch07.lecture.p04cast;

import ch07.sec07.exam03.Child;
import ch07.sec07.exam03.Parent;

public class C03InstanceOf {
    public static void main(String[] args) {
        Parent3 a = new Child1();

        if (a instanceof Child1) {
            Child1 b = (Child1) a;
        }

        if (a instanceof Child2) {
            Child2 c = (Child2) a;
        }
        System.out.println("다음 코드");
    }
}


