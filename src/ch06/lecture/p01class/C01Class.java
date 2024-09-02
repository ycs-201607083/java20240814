package ch06.lecture.p01class;

public class C01Class {
    public static void main(String[] args) {
        String a = new String("java");

        MyClass1 myClass = new MyClass1();
        MyClass1 myClass2 = new MyClass1();

        int codeA = System.identityHashCode(a);
        System.out.println("codeA = " + codeA);

        int codeB = System.identityHashCode(myClass);
        System.out.println("codeA = " + codeB);

        int codeC = System.identityHashCode(myClass2);
        System.out.println("codeA = " + codeC);
    }
}

class MyClass1 {

}
