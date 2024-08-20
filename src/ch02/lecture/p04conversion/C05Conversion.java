package ch02.lecture.p04conversion;

public class C05Conversion {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a + b;

        int d = 3;
        long e = 5;
        long f = d + e;

        int g = 3;
        long h = 40_0000_0000L;
        long i = g + h;
        System.out.println("i=" + i);
    }
}
