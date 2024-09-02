package ch06.lecture.p05static.class2;

public class C02Field {
    public static void main(String[] args) {
        MyClass02 a1 = new MyClass02();

        int q = MyClass02.age = 60;
        String w = MyClass02.name = "ss";

        System.out.println(q);
        System.out.println(w);

    }
}
