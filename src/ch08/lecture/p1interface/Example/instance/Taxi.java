package ch08.lecture.p1interface.Example.instance;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시 달림");
    }
}
