package ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a;
        int arr[];

        a = 3;
        arr = new int[]{5, 6};

        System.out.println(a);
        System.out.println(System.identityHashCode(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int brr[];
        brr = arr;

        arr[0] = 50;

        System.out.println(arr[0]);
        System.out.println(brr[0]);
    }
}
