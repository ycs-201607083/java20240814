package ch07.lecture.p04cast;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();

        if (a instanceof B) {
            B b = (B) a;
        }

        if (a instanceof C) {
            C c = (C) a;
        }

        if (a instanceof C c) {

        }
    }
}
