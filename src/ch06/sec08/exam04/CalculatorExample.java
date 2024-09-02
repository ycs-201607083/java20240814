package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator a = new Calculator();

        double result1 = a.areaRectangle(15.3);
        double result2 = a.areaRectangle(15.3, 12.3);

        System.out.println("정사각형 넓이 = " + result1);
        System.out.println("직사각형 넓이 = " + result2);
    }
}
