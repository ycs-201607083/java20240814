package ch03.lecture.p05break;

public class C02Continue {
    int MAX_NUM = 10;

    public static void main(String[] args) {
        C02Continue c02Continue = new C02Continue();
        /*c02Continue.star(10);
        System.out.println();
        c02Continue.switchExpression("A");
        c02Continue.q5();*/
        c02Continue.star2(5);
        System.out.println();

    }

    private void q5() {
        int result = 60;
        int x;
        int y;

        for (x = 0; x <= MAX_NUM; x++) {
            for (y = 0; y <= MAX_NUM; y++) {
                if (((4 * x) + (5 * y)) == result) {
                    System.out.println("x = " + x + "\ny = " + y);
                }
            }
        }
    }

    private void switchExpression(String aOrB) {//2번 문제;
        int result;
        int score = 0;

        score = switch (aOrB) {
            case "A" -> 100;
            case "B" -> {
                result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println(score);
    }

    private void star(int n) {//6번 문제
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    private void star2(int n) {
        System.out.print("별 뒤집기 뒤집기(계단)");
        for (int i = n; i > 0; i--) {
            System.out.println();
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.print("숫자 정방향(계단)");
        for (int a = 0; a < n; a++) {
            System.out.println();
            for (int f = 0; f <= a; f++) {
                System.out.print(f);
            }

            System.out.println();
            System.out.print("숫자 거꾸로 뒤집기(계단)");
            for (int q = n; q > 0; q--) {
                System.out.println();
                for (int w = q; w > 0; w--) {
                    System.out.print(w);
                }
            }

            System.out.println();
            System.out.print("숫자 거꾸로 뒤집기2(계단)");
            int r = 0;
            for (int q = n; q > 0; q--) {
                System.out.println();
                for (int w = q; w > 0; w--) {
                    System.out.print(r % 10);
                    r++;
                }
            }

            System.out.println();
            System.out.println("숫자 똑바로");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }

            System.out.print("숫자 반대로");
            System.out.println();
            for (int i = 4; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}

