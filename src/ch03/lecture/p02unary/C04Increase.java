package ch03.lecture.p02unary;

public class C04Increase {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println("a =" + a);

        int c = a++;
        System.out.println("a =" + a);
        System.out.println("c =" + c);
        System.out.println("a =" + a);

        int e = 11;
        int f = e;
        e++;
        System.out.println("f=" + f);
        System.out.println("e=" + e);

        e++;
        int g = e;
        System.out.println("g = " + g);
        System.out.println("e = " + e);
    }
}
