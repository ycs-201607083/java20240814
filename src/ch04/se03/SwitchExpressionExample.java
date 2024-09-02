package ch04.se03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println('A');
            }
            case 'B', 'b' -> {
                System.out.println('B');
            }
            case 'C', 'c' -> {
                System.out.println('C');
            }
            default -> {
                System.out.println("F");
            }
        }
    }
}
