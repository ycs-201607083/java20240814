package ch03.lecture.p04logical;

public class C04ShortCircuit {
    public static void main(String[] args) {
        boolean a = false && false;

        int b = 5;
        int c = 5;
        boolean d = ((b++) < 0 && (c++) < 0);

        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int e = 5;
        int f = 5;
        boolean g = ((e++) < 0 & (f++) < 0);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
    }
}
