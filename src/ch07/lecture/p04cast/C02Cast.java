package ch07.lecture.p04cast;

public class C02Cast {
    public static void main(String[] args) {
        Parent2 p = new Parent2();
        Child21 c = (Child21) p;

        Parent2 q = new Child21();
        Child21 d = (Child21) p;

        System.out.println("프로그램 종료");
    }
}
