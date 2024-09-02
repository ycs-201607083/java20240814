package ch07.p07protected.package1;

public class A {
    public void publicMethod() {
        System.out.println("a.publicMethod");
    }

    protected void packageProtectedMethod() {
        System.out.println("a.packagePrivateMethod");
    }

    void packagePrivateMethod() {
        System.out.println("a.packagePrivateMethod");
    }
}
