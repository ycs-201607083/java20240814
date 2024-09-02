package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {

    public D() {

    }

    public void method() {
        this.field = "val";
        this.method();
    }

    public void method2() {

    }
}
