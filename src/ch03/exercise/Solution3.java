package ch03.exercise;

public class Solution3 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pp = pencils / students;
        System.out.println("인당 연필 개수 = " + pp);

        int p = pencils % students;
        System.out.println("남은 연필 수 = " + p);

    }

}
