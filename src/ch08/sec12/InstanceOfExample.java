package ch08.sec12;

public class InstanceOfExample {
    public static void main(String[] args) {
        Taxi t = new Taxi();
        Bus b = new Bus();

        ride(b);
        System.out.println();
        Vehicle v = new Bus();

        ride(t);
        action(v);
    }

    public static void action(Vehicle v) {
        if (v instanceof Bus bus) {
            bus.run();
        }
    }

    public static void ride(Vehicle v) {
        if (v instanceof Bus bus) {
            bus.checkFare();
        }
    }
}
