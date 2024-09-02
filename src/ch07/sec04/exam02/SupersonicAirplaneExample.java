package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane();
        superSonicAirplane.takeOff();
        superSonicAirplane.fly();
        superSonicAirplane.flyMode = superSonicAirplane.SUPERSONIC;
        superSonicAirplane.fly();
        superSonicAirplane.flyMode = superSonicAirplane.NORMAL;
        superSonicAirplane.fly();
        superSonicAirplane.land();
    }
}
