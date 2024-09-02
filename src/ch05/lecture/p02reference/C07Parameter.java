package ch05.lecture.p02reference;

public class C07Parameter {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}};

        System.out.println(arr[0][0]);
        method1(arr);
        System.out.println(arr[0][0]);
    }

    public static void method1(int[][] a) {
        a[0] = new int[]{33, 44};
    }
}
