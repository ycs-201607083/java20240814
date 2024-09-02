package ch08.lecture.p03cast;

public class C03InstanceOf {
    public static void main(String[] args) {
        MyInterface3 a = new Child3();

        System.out.println(a instanceof Child3);
        System.out.println(a instanceof Parent3);
        System.out.println(a instanceof MyInterface3);

        MyInterface3 s = new Parent3();
        System.out.println(s instanceof Parent3);
        System.out.println(s instanceof MyInterface3);
        System.out.println(s instanceof Child3);
    }


}


