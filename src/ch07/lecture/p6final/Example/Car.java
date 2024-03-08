package ch07.lecture.p6final.Example;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        System.out.println("정지");
        speed = 0;
    }
}
