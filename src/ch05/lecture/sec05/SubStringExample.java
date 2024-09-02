package ch05.lecture.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssb = "333333-2222222";

        String firstNum = ssb.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssb.substring(7);
        System.out.println(secondNum);
    }
}
