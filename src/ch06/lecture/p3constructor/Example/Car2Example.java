package ch06.lecture.p3constructor.Example;

public class Car2Example {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        System.out.println("제조사: " + car1.company);
        System.out.println();

        Car2 car2 = new Car2("자가용");
        System.out.println("제조사: " + car2.company);
        System.out.println("모델: " + car2.model);
        System.out.println();

        Car2 car3 = new Car2("자가용", "빨강");
        System.out.println("제조사: " + car3.company);
        System.out.println("모델: " + car3.model);
        System.out.println("색상: " + car3.color);
        System.out.println();
// alt+shift 클릭 = 멀티커서
        Car2 car4 = new Car2("트럭", "검정", 200);
        car4.company = "테슬라";
        System.out.println("제조사: " + car4.company);
        System.out.println("모델: " + car4.model);
        System.out.println("색상: " + car4.color);
        System.out.println("최고속도: " + car4.maxSpeed);
        System.out.println();


    }
}
