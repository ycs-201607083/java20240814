package ch05.p01array;

public class C02Array {
    public static void main(String[] args) {
        int a[];

        a = new int[3];

        a[0] = 1;
        a[2] = 15;
        a[1] = 213;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
