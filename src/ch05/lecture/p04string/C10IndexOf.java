package ch05.lecture.p04string;

public class C10IndexOf {
    public static void main(String[] args) {
        //indexOf : 특정 문자열이 있는 위치 리턴
        String s = "java programing language";
        int a = s.indexOf("java");
        System.out.println("a = " + a);

        int b = s.indexOf("pro");
        System.out.println("b =" + b);

        int c = s.indexOf("lang");
        System.out.println("c = " + c);

        int f = s.indexOf("python");
        System.out.println("c = " + f);

        int dd = s.indexOf("css");
        if (dd == -1) {
            System.out.println("css없음");
        } else {
            System.out.println("css있음");
        }
    }
}
