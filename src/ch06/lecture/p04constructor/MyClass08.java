package ch06.lecture.p04constructor;

public class MyClass08 {
    int age;
    int id;
    String name;
    String address;

    public MyClass08(int age, int id, String name, String address) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public MyClass08(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
}
