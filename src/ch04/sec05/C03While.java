package ch04.sec05;

public class C03While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if ((i % 2) == 0) {
                System.out.println("i = " + i);
            }
            i++;
        }

        int a = 0;
        int aSum = 0;
        while (a < 100) {
            if ((a % 3) == 0) {
                aSum += a;
            }
            a++;
        }
        System.out.println("aSum = " + aSum);
    }
}
