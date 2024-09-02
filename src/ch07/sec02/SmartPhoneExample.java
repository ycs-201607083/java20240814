package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델 = " + smartPhone.model);
        System.out.println("색상 = " + smartPhone.color);

        System.out.println("와이파이 상태 = " + smartPhone.wifi);

        smartPhone.bell();
        smartPhone.setWifi(true);
        smartPhone.sendVoice("ㅎㅇㅇ");
        smartPhone.receiveVoice("ㅎㅇㅇ ㅎㅎㅎ");
        smartPhone.hangUp();
        smartPhone.internet();
    }
}
