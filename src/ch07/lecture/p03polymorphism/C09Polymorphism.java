package ch07.lecture.p03polymorphism;

import ch06.lecture.p09ecapsulation.MyClass01;

public class C09Polymorphism {
    public static void main(String[] args) {
        MyClass09 a = new MyClass09();
        a.number = (new Integer(3333));
        a.PrintDoubleNumber();

        MyClass09 b = new MyClass09();
        b.number = new Double(3.14);
        b.PrintDoubleNumber();
    }
}
