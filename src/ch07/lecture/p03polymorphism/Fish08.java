package ch07.lecture.p03polymorphism;

public class Fish08 extends Animal8 {
    @Override
    public void breathe() {
        System.out.println("아가미로 숨을 쉰다");
    }

    public void hint() {
        System.out.println("사냥에 나선다");
    }
}
