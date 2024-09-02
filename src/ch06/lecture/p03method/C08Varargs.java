package ch06.lecture.p03method;

public class C08Varargs {
    public static void main(String[] args) {
        MyClass08 a = new MyClass08();

        a.m1();
        a.m1(1);
        a.m1(1, 2);
        a.m1(1, 2, 3, 4, 5, 6);
    }
}
