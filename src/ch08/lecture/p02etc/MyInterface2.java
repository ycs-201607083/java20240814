package ch08.lecture.p02etc;

public interface MyInterface2 {
    //코드블럭(메소드, 몸통,  body)이 있는 인터페이스의 메서드
    default void method1() {
        System.out.println("재정의 가능");
    }
}