package ch06.lecture.p09ecapsulation.qestion;

public class Q282_19 {
    public static void main(String[] args) {
        Member a = new Member();

        a.setBalance(10000);
        System.out.println("현재잔고 = " + a.getBalance());
        a.setBalance(-100);
        System.out.println("현재잔고 = " + a.getBalance());
        a.setBalance(200000);
        System.out.println("현재잔고 = " + a.getBalance());
        a.setBalance(300000);
        System.out.println("현재잔고 = " + a.getBalance());

    }
}
