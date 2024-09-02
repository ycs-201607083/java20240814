package ch06.lecture.p05static.class1;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 a1 = new MyClass01();
        MyClass01 a2 = new MyClass01();

        a1.age = 30;
        a2.age = 40;

        System.out.println(a1);
        System.out.println(a2);

        MyClass01.number = 30;
        System.out.println(MyClass01.number);
    }
}
