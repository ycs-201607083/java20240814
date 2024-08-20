package ch03.lecture.p01arithmetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        long e = 7L;
        double f = 3.14;
        double h = e + f;

        //나누기: 정수 끼리의 연산 결과는 정수
        System.out.println(10 / 3);
        //나누기: 실수끼리의 연산 결과는 실수
        System.out.println(10.0 / 3.0);
        //나누기: 정수와 실수끼리 연산 결과는 실수
        System.out.println(10 / 3.0);
    }
}
