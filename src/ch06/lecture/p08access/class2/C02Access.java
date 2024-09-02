package ch06.lecture.p08access.class2;

public class C02Access {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.age = 12;
        int f = a.age;
        a.m1(f, "sd");
    }
}
