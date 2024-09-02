package ch03.lecture.p04for;

public class C05Gugudan {
    final static int MIN_NUM = 1;
    final static int MAX_NUM = 9;

    public static void main(String[] args) {
        //9단부터 2단까지 반대로 출력
        int dan;
        int num;
        int result;
        //
        for (dan = MAX_NUM; dan >= MIN_NUM; dan--) {
            for (num = MIN_NUM; num <= MAX_NUM; num++) {
                result = dan * num;
                System.out.println(dan + "X" + num + "=" + result);
            }
        }
    }
}
