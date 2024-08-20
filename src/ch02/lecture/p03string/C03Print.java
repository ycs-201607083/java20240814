package ch02.lecture.p03string;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf(" 형식 문자열 %s%n", "이름등등");
        System.out.printf("형식 문자열 여러 개 %s, %s%n", "첫번째", "두번째");
        System.out.printf("형식 %-10s%-10s%n", "abc", "def");

        System.out.printf("정수 %d, %d%%n", 123, 451);
        System.out.printf("실수 %010.1f,%n%010.3f%n", 3.14, 1.231);
    }
}
