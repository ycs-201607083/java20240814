package ch07.lecture.p03polymorphism;

import ch07.lecture.p02override.Child03;

public class C02polymorphism {
    public static void main(String[] args) {
        Child02 a = new Child02();
        Parent02 p = a;
        ParentParent02 q = p;

        ParentParent02 r = new Child02();

        Parent02 s = new Child02();
        Parent02 f = new Child02();
    }
}
