package ch07.lecture.p06final.execise;

public class C extends A {
    public void m1() {
        System.out.println("c-m1");
    }

    public void m2() {
        System.out.println("c-m2");
    }
}

class emam {
    public static void action(A a) {
        a.m1();
        if (a instanceof C c) {
            c.m2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}