package ch07.lecture.p4abstract.Example;

public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전우너을 킵니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
