package ch03.lecture.p01arithmetic;

public class C06Double {
    public static void main(String[] args) {

        double a = 3.0 / 0;
        System.out.println(a);

        System.out.println(3.0 / 0);
        System.out.println(-3.0 / 0);

        a = a - 10000000000000000L;
        System.out.println(a);

        System.out.println(3.0 % 0);

        //infinity 확인
        System.out.println(Double.isInfinite(a));
        System.out.println(Double.isInfinite(3.0));

    }
}
