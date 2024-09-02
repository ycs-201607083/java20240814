package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("모델 명:" + car.model);
        System.out.println("제조사 명:" + car.company);
        System.out.println("색상:" + car.color);
        System.out.println("최고속도:" + car.maxSpeed);
        System.out.println("현재속도:" + car.speed);
        car.speed = 30;
        System.out.println("변경된 속도:" + car.speed);
    }
}
