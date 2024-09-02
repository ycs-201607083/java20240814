package ch07.sec07.exam02;

public class childExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.m1();
        parent.m2();
    }
}
