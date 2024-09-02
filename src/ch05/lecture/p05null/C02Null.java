package ch05.lecture.p05null;

public class C02Null {
    public static void main(String[] args) {
        String a = "java";
        String b = null;

        String c;   //초기화 안함

        System.out.println(a);
        System.out.println(b);
        System.out.println(c = "3");
    }
}
