package ch06.sec13.exam03.package1;

public class B {
    public void m() {
        A a = new A();

        a.field1 = 1;
        a.field2 = 1;
//    a.field3 = 1;     private 필드 접근 불가

        a.m1();
        a.m2();
//    a.m3();             private 메서드 접근 불가
    }
}
