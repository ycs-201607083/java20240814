package ch08.sec07;

public interface Service {
    default void defaultM1() {
        System.out.println("defaultM1 종속 코드");
        defaultCommon();
    }

    default void defaultM2() {
        System.out.println("defaultM2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("defaultM 중복코드 A");
        System.out.println("defaultM 중복코드 B");
    }

    static void staticM1() {
        System.out.println("staticM1 종속 코드");
        staticCommon();
    }

    static void staticM2() {
        System.out.println("staticM2 종속 코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticM 중복코드 C");
        System.out.println("staticM 중복코드 D");
    }
}
