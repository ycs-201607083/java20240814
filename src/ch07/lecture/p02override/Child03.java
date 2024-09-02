package ch07.lecture.p02override;

public class Child03 extends Parent03 {

    @Override
    public void m1() {
        super.m1();
        System.out.println("다른 코드");
    }
}
