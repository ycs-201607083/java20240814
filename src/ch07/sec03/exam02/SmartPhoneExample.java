package ch07.sec03.exam02;

import ch07.sec03.exam01.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시", "화이트");

        System.out.println("모델 = " + smartPhone.model);
        System.out.println("색상 = " + smartPhone.color);
    }
}
