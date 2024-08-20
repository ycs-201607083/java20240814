package ch03.lecture.p04logical;

public class C02Logical {
    public static void main(String[] args) {
        System.out.println("and-------------------------");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("or-------------------------");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("xor-------------------------");
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        System.out.println("not-------------------------");
        System.out.println(!true);
        System.out.println(!false);
    }
}
