package ch03.lecture.p04for;

public class C04Gugudan {
    final static int MAX_NUM = 10;

    public static void main(String[] args) {
        //3의 배수 단만 출력
        int dan;
        int num;
        int result;


        for (dan = 2; dan < MAX_NUM; dan++) {
            for (num = 2; num < MAX_NUM; num++) {
                if ((dan % 3) == 0) {
                    result = dan * num;
                    System.out.println(dan + "X" + num + "=" + result);
                }
            }

        }
    }
}
