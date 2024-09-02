package ch07.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.color = color;
        this.model = model;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태변경");
    }

    public void internet() {
        System.out.println("인터넷 연결");
    }
}
