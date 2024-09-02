package ch08.lecture;

import ch08.lecture.p03cast.MyClass1;
import ch08.lecture.p03cast.MyClass21;
import ch08.lecture.p03cast.MyClass22;
import ch08.lecture.p03cast.my_interface.MyInterface2;

public class C02Cast {
    public static void main(String[] args) {
        MyInterface2 a = new MyClass21();

        if (a instanceof MyClass21) {
            MyClass21 b = (MyClass21) a;
        }
        if (a instanceof MyClass21) {
            MyClass22 q = (MyClass22) a;
        }
        System.out.println("다운 코드");
    }
}
