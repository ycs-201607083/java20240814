package ch06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.model = "그렌져";
        System.out.println("모델명 " + car.model);
        car.start = true;
        System.out.println("시동여부 " + car.start);
        car.speed = 350;
        System.out.println("현재속도 " + car.speed);
    }
}
