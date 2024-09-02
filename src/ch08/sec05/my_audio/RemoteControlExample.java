package ch08.sec05.my_audio;


import ch08.sec05.my_interface.RemoteControl;
import ch08.sec05.television.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOff();
        rc.turnOn();
        rc.setVolume(5);

        rc.setVolume(true);
        rc.setVolume(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setVolume(true);
        rc.setVolume(false);
    }
}
