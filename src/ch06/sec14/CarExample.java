package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.setSpeed(-50);
        System.out.println("현재속도= " + c.getSpeed());

        c.setSpeed(60);
        System.out.println("현재속도= " + c.getSpeed());

        if (!c.isStop()) {
            c.setStop(true);
        }
        System.out.println("현재속도= " + c.getSpeed());

    }
}
