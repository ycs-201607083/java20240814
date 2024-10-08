package ch08.sec05.television;

import ch08.sec05.my_interface.RemoteControl;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("tv킴");
    }

    @Override
    public void turnOff() {
        System.out.println("tv끔");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 tv 볼륨 = " + this.volume);
    }
}
