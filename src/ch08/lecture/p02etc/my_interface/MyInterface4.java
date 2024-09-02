package ch08.lecture.p02etc.my_interface;

public interface MyInterface4 {
    default void m2() {
        System.out.println("어떤코드1");
        extracted();
    }

    private void extracted() {
        System.out.println("어떤코드2");
        System.out.println("어떤코드3");
    }
    
}
