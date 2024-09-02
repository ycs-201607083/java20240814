package ch07.p07protected.package1;

public class B {
    public void someMethod() {
        A a = new A();
        a.publicMethod();
        a.packagePrivateMethod();
        a.packageProtectedMethod();
    }
}
