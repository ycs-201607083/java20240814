package ch03.lecture.p03compare;

public class C03String {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        System.out.println(a == b);

        String c = "html";
        String d = "ht";
        String e = "ml";
        String f = d + e;

        System.out.println("c = " + c);
        System.out.println("f = " + f);

        System.out.println(c.equals(f));
    }
}
