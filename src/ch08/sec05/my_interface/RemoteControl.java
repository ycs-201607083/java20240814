package ch08.sec05.my_interface;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setVolume(boolean mute) {
        if (mute) {
            System.out.println("무음처리");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
        }
    }

    static void ChangeBattery() {
        System.out.println("리모콘 건전지를 교환합니다.");
    }
}
