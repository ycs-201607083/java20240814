package ch06.lecture.p03method;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        MyClass03 b = new MyClass03();

        a.name = "치킨";
        a.printName();

        b.name = "맥주";
        b.printName();
    }
}
