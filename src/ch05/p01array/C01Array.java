package ch05.p01array;


import java.util.Arrays;

import static programers.Solution.solu;
import static programers.Solution.solution;

public class C01Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[]{32, 24, 49, 12, 45, 45, 33, 52, 53};
        System.out.println("============");
        System.out.println("b = " + Arrays.toString(b));
        solu(b);
        System.out.println("============");
        a[0] = 1;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
