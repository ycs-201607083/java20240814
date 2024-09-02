package ch05.lecture.p04string;

public class C11Contains {
    public static void main(String[] args) {
        String s = "java programing language";
        boolean a = s.contains("java");
        boolean b = s.contains("pro");
        boolean c = s.contains("a");
        boolean d = s.contains("css");

        System.out.println("a =" + a);
        System.out.println("a =" + b);
        System.out.println("a =" + c);
        System.out.println("a =" + d);
    }
}
