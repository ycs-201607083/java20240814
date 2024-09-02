package ch06.lecture.p04constructor;

public class C05This {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        MyClass05 s = new MyClass05();

        a.name = "qwe";
        s.name = "zcx";

        a.printFullItems();
        s.printFullItems();
    }
}


