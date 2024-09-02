package ch08.sec05.my_audio;

import ch08.sec05.my_interface.RemoteControl;

public class Audio implements RemoteControl {
    private int volume;
    private int memoryVolume;
    RemoteControl rc;

    @Override
    public void turnOn() {
        System.out.println("tv를 켬");
    }

    @Override
    public void turnOff() {
        System.out.println("tv를 끔");
    }

    @Override
    public void setVolume(int volume) {
        rc = new Audio();

        if (volume > rc.MAX_VOLUME) {
            this.volume = rc.MAX_VOLUME;
        } else if (volume < rc.MIN_VOLUME) {
            this.volume = rc.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public void setVolume(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);
        }
    }

}
