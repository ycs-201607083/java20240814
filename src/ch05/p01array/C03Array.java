package ch05.p01array;

public class C03Array {
    public static void main(String[] args) {
        int a[];
        double b[];
        char c[];
        String d[];

        a = new int[3];
        b = new double[2];
        c = new char[4];
        d = new String[3];

        a[2] = 100;
        b[1] = 3.14;
        c[3] = '한';
        d[2] = "java";

        for (int i = 0; i < b.length; i++) {
            System.out.println(a[i]);
            System.out.println(b[i]);
            System.out.println(c[i]);
            System.out.println(d[i]);
        }


    }
}
