package ch07.lecture.p6final.Example;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//    @Override
//    public void stop() {
//        System.out.println("스포츠카 정지");
//        speed = 0;
//    }
}
