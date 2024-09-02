package ch06.lecture.p04constructor;

public class MyClass07 {
    int id;
    int age;

    public MyClass07(int id, int age) {
        this.id = id;
        this.age = age;
    }

    String name;
    String address;

    public MyClass07(int id, int age, String name, String address) {
        this.id = id;
        this.address = address;
        this.age = age;
        this.name = name;

    }
}
