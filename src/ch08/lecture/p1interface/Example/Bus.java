package ch08.lecture.p1interface.Example;

public class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
