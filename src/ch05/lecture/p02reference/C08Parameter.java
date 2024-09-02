package ch05.lecture.p02reference;

public class C08Parameter {
    public static void main(String[] args) {
        int b = 5;
        System.out.println(b);
        method1(b);

    }

    public static void method1(int a) {
        System.out.println(a);
        a = 55;
        System.out.println(a);
    }
}
