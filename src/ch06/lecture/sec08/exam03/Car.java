package ch06.lecture.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("가스없음");
            return false;
        }
        System.out.println("가스있음");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달린다(gas잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춘다(gas잔량:" + gas + ")");
                return;
            }
        }
    }
}
