package ch03.lecture.p01if;

public class C05Nested {
    public static void main(String[] args) {

        if (true) {
            System.out.println(1);
            if (false) {
                System.out.println(2);
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        }
        System.out.println(5);
    }
}
