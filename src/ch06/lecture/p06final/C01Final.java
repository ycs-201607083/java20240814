package ch06.lecture.p06final;

public class C01Final {
    public static void main(String[] args) {
        int a = 33;
        System.out.println(a);
        a = 4;
        System.out.println(a);

        final int b;
        b = 30;
        System.out.println(b);
        //final은 상수 값 변경 안됨
        //b=20;     X

        final int c = 30;

    }
}
