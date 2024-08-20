package ch02.lecture.p03string;

public class C05Parsing {
    public static void main(String[] args) {
        String a = "33";

        int a1 = Integer.parseInt(a);

        int b = 2 * a1;

        System.out.println("b = " + b);

        String c = "3.14";

        double c1 = Double.parseDouble(c);

        double d = 5 + c1;

        System.out.println("d = " + d);
    }
}
