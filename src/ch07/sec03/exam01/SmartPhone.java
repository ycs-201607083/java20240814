package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        this.color = color;
        this.model = model;

        System.out.println("SmartPhone(String model, String color) 생성자 실행");
    }
}
