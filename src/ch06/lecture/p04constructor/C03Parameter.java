package ch06.lecture.p04constructor;

public class C03Parameter {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03(12, "asd");

        System.out.println(a.age);

        MyClass03 b = new MyClass03(10, "asd");

        System.out.println(b.age);
    }
}
