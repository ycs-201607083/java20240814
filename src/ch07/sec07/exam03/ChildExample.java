package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.m1();
        parent.m2();

        Child child = (Child) parent;

        child.field2 = "data2";
        child.m3();
    }

}

