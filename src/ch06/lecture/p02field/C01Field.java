package ch06.lecture.p02field;

import ch06.lecture.MyClass2;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01 b = new MyClass01();

        System.out.println("a.age = " + a.age);
        System.out.println("b.age = " + b.age);
        System.out.println("a.name = " + a.name);
        b.name = "monitor";
        System.out.println("b.name = " + b.name);
    }
}


