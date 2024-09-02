package ch05.lecture;

public class C04IsEmpty {
    public static void main(String[] args) {
        //길이가 같을 때만 true

        String a = "";
        String b = "a          d";
        String c = "a";
        String d = "asd";

        System.out.println(a.isEmpty());
        System.out.println(b.isEmpty());
        System.out.println(c.isEmpty());
        System.out.println(d.isEmpty());
        System.out.println(b.trim());
    }
}
