package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("집가고싶다", "929292-1234567");

        System.out.println("국가 : " + k1.nation);
        System.out.println("이름 : " + k1.name);
        System.out.println("번호 : " + k1.ssn);

        Korean k2 = new Korean("집에 가고 싶다", "123456-1234567");

        System.out.println("국가 : " + k2.nation);
        System.out.println("이름 : " + k2.name);
        System.out.println("번호 : " + k2.ssn);
    }
}
