package ch06.lecture.p04constructor;

public class MyClass05 {
    int score;
    String name;

    void printName() {
        System.out.println(name);
    }

    void printFullItems() {
        this.printName();
        System.out.println(this.score);
    }
}
