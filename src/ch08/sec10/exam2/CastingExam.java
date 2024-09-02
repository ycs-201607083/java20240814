package ch08.sec10.exam2;

public class CastingExam {
    public static void main(String[] args) {
        Vehicle v = new Bus();

        v.run();

        Bus b = (Bus) v;
        b.run();
        b.checkFare();
    }
}
