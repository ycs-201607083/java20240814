package ch06.lecture.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator a = new Calculator();

        a.powerOn();

        int plus = a.plus(1, 3);

        int division = a.division(5, 2);

        System.out.println(plus);
        System.out.println(division);

        a.powerOff();
    }
}
