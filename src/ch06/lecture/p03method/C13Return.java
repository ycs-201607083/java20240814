package ch06.lecture.p03method;

public class C13Return {
    public static void main(String[] args) {
        MyClass13 a = new MyClass13();

        double d = a.makeDouble(9);
        System.out.println(d);

        String s = a.makeTriple("집가고싶당 ");
        System.out.println(s);
    }
}
