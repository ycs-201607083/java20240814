package ch07.lecture.p03polymorphism;

public class C04Polymorpyism {
    public static void main(String[] args) {
        Child041 c41 = new Child041();
        c41.m041();
        c41.m041();

        Child042 c42 = new Child042();
        c42.m041();
        c42.m042();

        Parent04 p4 = c41;
        Parent04 p5 = c42;

    }
}
