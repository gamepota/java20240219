package ch08.lecture.p1interface.Example.television;

public class RemotControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        //359쪽
        RemoteControl.changeBattery();
    }
}
