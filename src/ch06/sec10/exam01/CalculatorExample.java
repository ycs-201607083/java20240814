package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        double result = 10 * 10 * Calculator.pi;

        int result1 = Calculator.plus(10, 5);
        int result2 = Calculator.minus(10, 5);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result = " + result);
    }
}
