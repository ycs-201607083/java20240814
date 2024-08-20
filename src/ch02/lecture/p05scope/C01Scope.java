package ch02.lecture.p05scope;

public class C01Scope {
    public static void main(String[] args) {
        int a = 3;

        st(a);

        if (true) {
            int b = 5;
            System.out.println("b = " + b);
        }

    }

    public static void st(int a) {
        System.out.println("a = " + a);
    }
}
