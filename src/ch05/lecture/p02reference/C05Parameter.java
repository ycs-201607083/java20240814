package ch05.lecture.p02reference;

public class C05Parameter {
    public static void main(String[] args) {
        C05Parameter c05Parameter = new C05Parameter();
        int arr[] = new int[]{5, 4};
        method(arr);

    }

    public static void method(int a[]) {
        System.out.println(a[0]);
        a[0] = 55;
        System.out.println(a[0]);
    }
}
