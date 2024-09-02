package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "ㄴㅇㄴㅇ");

        System.out.println(k1.name);
        System.out.println(k1.nation);
        System.out.println(k1.ssn);

        /*final 필드는 값을 변경 할 수 없음(상수)
        k1.ssn = "124-12412-2";
        k1.nation = "JP";
        */
        k1.name = "집집";

    }
}
