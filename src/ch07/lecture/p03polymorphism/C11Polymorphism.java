package ch07.lecture.p03polymorphism;

public class C11Polymorphism {
    public static void main(String[] args) {
        Bear11 bear = getBeer();

        if (bear instanceof WhiteBear11 b) {
            b.swim();
        }
        bear.hunt();
    }

    public static Bear11 getBeer() {
        double r = Math.random();
        if (r < 0.5) {
            return new WhiteBear11();
        }
        return new Bear11();
    }
}
