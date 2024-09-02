package ch09.lecture.p01anonymous;

public class C01Anonymous {
    public static void main(String[] args) {
        Parent1 a = new Parent1();
        a.someM();

        new Parent1().someM();

        Child1 s = new Child1();
        s.someM();

        //상속받아서 새 클래스 만들고 인스턴스 생성
        Parent1 f = new Parent1() {
            @Override
            public void someM() {
                System.out.println("C01Anonymous.someM");
            }
        };
        f.someM();
    }
}

class Parent1 {
    public void someM() {
        System.out.println("Parent1.someM");
    }
}

class Child1 extends Parent1 {
    public void someM() {
        System.out.println("Child1.someM");
    }
}