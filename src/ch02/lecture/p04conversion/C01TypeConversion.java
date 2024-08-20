package ch02.lecture.p04conversion;

public class C01TypeConversion {
    public static void main(String[] args) {

        int a = 21_0000_0000;
        long b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        short c = (short) a;    //강제 형 변환
        System.out.println("c = " + c);
        int d = 21_0000_0000;
        short e = (short) d;
        System.out.println("e = " + e);
    }
}
