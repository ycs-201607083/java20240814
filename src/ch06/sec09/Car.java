package ch06.sec09;

public class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(model + "차량이 달립니다(시속 : " + speed + ")");
    }
}
