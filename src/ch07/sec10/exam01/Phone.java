package ch07.sec10.exam01;

public abstract class Phone {
    String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("전원을 켜다");
    }

    void turnOff() {
        System.out.println("전원을 끄다");
    }
}
