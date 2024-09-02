package ch03.lecture.p04for;

public class C02Gugudan {
    public static void main(String[] args) {
        int dan;
        int result;
        int num;

        for (num = 2; num < 10; num++) {
            System.out.println();
            for (dan = 2; dan < 10; dan++) {
                result = dan * num;
                System.out.print(num + "X" + dan + "=" + result);
                System.out.print(" ");

            }
        }
    }
}
