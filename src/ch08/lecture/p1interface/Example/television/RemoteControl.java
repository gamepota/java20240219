package ch08.lecture.p1interface.Example.television;

public interface RemoteControl {
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교체합니다.");
    }

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음  처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
}
