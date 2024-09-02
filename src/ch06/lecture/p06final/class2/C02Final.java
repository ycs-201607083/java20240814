package ch06.lecture.p06final.class2;

public class C02Final {
    public static void main(String[] args) {

    }

    static void m1(int n) {
        System.out.println(n);
        n = 90;
        System.out.println(n);
    }

    static void m2(final int n) {
        System.out.println(n);
        //n = 90;  안댐
        System.out.println(n);
    }
}
