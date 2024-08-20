package ch02.lecture.p04conversion;

public class C06TypeConversion {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 5;
        byte c = (byte) (a + b);

        int d = 5;
        int e = 3;
        int f = d / e;
        System.out.println("f = " + f);

        int v1 = 10;
        int v2 = 20;
        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        int result2 = v1 + v2;
        System.out.println();

    }
}
