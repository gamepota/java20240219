package ch07.lecture.p1inheritance.Example;

public class Phone {
    public String model;
    public String color;

    public void bell() {
        System.out.println("벨이 울린다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대: " + message);
    }

    public void hangup() {
        System.out.println("전화를 끊었습니다.");
    }

}

class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경");
    }

    public void internet() {
        System.out.println("인터넷 연결");
    }
}
