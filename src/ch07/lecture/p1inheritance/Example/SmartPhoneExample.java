package ch07.lecture.p1inheritance.Example;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "화이트");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
        System.out.println("와이파이 상태: " + myPhone.wifi);
        myPhone.bell();
        myPhone.sendVoice("여보쇼");
        myPhone.receiveVoice("여보아닙니다.");
        myPhone.sendVoice("그럼 끊으쇼.");
        myPhone.hangup();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
