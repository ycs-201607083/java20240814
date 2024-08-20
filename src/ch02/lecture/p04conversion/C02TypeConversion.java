package ch02.lecture.p04conversion;

public class C02TypeConversion {
    public static void main(String[] args) {
        float a = 3.14f;
        double b = a;

        double c = 3.14;
        float d = (float) c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
