package ch06.lecture.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.setGas(0);

        if (c.isLeftGas()) {
            System.out.println("출발|");

            c.run();
        }

        System.out.println("가스 주입 시급");
    }
}
