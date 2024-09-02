package ch05.lecture.p02reference;

public class C02Reference {
    public static void main(String[] args) {
        int arr[] = {7, 8};
        int brr[] = {1, 2};
        int crr[] = arr;

        System.out.println("arr = " + arr[0]);
        System.out.println("brr = " + brr[0]);
        System.out.println("crr = " + crr[0]);

        arr[0] = 71;
        brr[0] = 72;
        crr[0] = 73;

        System.out.println("arr = " + arr[0]);
        System.out.println("brr = " + brr[0]);
        System.out.println("crr = " + crr[0]);


    }
}
