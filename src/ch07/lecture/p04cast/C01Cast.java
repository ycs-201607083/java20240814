package ch07.lecture.p04cast;

import ch07.sec07.exam02.Child;
import ch07.sec07.exam02.Parent;

public class C01Cast {
    public static void main(String[] args) {
        Parent1 o = new Child11();
        Parent1 p = new Child12();
        Parent1 q = p;

        Child11 r = (Child11) o;
        Child12 s = (Child12) q;
    }
}
