package ch05.lecture.sec05;

import java.util.Arrays;

public class C13Split {
    public static void main(String[] args) {
        String s = "java,css,spring,react";
        String t[] = s.split(",");
        System.out.println(t[0]);
        System.out.println(t[1]);
        System.out.println(t[2]);
        System.out.println(t[3]);

        String u = "java css html";
        String v[] = u.split(" ");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println(v[2]);

        String z = "javaa  htaaml";
        String a[] = z.split("  ");
        System.out.println(a[0]);
        System.out.println(a[1]);

        
    }
}
