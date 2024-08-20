package ch03.lecture.p01arithmetic;

public class C04OverFlow {
    public static void main(String[] args) {
        byte a = 127;
        a = (byte) (a + 1);

        System.out.println("a = " + a);

        byte b = -128;
        b = (byte) (b - 1);
        System.out.println("b = " + b);
    }
}
