package ch06.lecture.p08access.class2;

public class MyClass02 {
    int age;
    private String name;
    private String address;

    void m1(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(age);
        System.out.println(name);
        System.out.println(address);
    }
}
