package ch06.exam04;

public class Car {
    String company = "현대";
    String model;
    String color;
    int maxSpeed;


    public Car() {
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model) {
        this.model = model;
    }


}
