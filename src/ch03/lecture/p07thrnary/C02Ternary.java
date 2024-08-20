package ch03.lecture.p07thrnary;

public class C02Ternary {
    public static void main(String[] args) {
        int age = 15;

        String message = (age >= 13 && age <= 19) ? "청소년" : "아님";

        System.out.println(message);
    }
}
