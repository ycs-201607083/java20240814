package ch06.lecture.p05static.class5;

public class MyClass05 {
    int age;
    static int num;

    static {
        boolean a = true;
        if (a) {
            num = 10;
        } else {
            num = 100;
        }
    }

    MyClass05() {
        age = 5;
    }
}
