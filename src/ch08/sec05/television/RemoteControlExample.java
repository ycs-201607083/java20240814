package ch08.sec05.television;

import ch08.sec05.my_interface.RemoteControl;
import ch08.sec05.television.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();

        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);

        rc.setVolume(true);
        rc.setVolume(false);

        System.out.println();
        RemoteControl.ChangeBattery();
    }
}
