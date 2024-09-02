package ch07.lecture.p01inheritance;

public class C02AbstractMethod {
    public static void main(String[] args) {
        Mammal2 a = new Bear2();
        Mammal2 b = new Horse2();

        a.walk();
        b.walk();
    }
}

