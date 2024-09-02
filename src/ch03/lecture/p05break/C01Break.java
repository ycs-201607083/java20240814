package ch03.lecture.p05break;

public class C01Break {
    public static void main(String[] args) {
        while (true) {
            double num = (int) (Math.random() * 6 + 1);
            System.out.println((int) num);
            if (num == 6) {
                break;
            }
        }

        int num1 = (int) (Math.random() * 6 + 1);
        int num2 = (int) (Math.random() * 6 + 1);
        while (true) {
            System.out.println("1번 주사위 숫자 = " + num1);
            System.out.println("2번 주사위 숫자 = " + num2);
            System.out.println("1번 주사위 숫자는 " + num1 + "이고 2번 주사위 숫자는 = " + num2);

            if ((num1 + num2) == 5) break;
        }
    }
}
