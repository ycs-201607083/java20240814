package ch07.lecture.p03polymorphism;

public class C05Polymorphism {
    public static void main(String[] args) {
        String s = "java";
        boolean b = s.isEmpty();

        Object o = s;

        int i = o.hashCode();
        String v = o.toString();

        System.out.println(b);
        System.out.println(i);
        System.out.println(v);
    }

}
