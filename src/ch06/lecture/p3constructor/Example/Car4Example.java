package ch06.lecture.p3constructor.Example;

public class Car4Example {
    public static void main(String[] args) {
        Car4 car1 = new Car4("자가용");
        System.out.println("회사명 : " + car1.company);
        System.out.println("모델명 : " + car1.model);
        System.out.println();

        Car4 car2 = new Car4("화물용", "빨강");
        System.out.println("회사명 : " + car2.company);
        System.out.println("모델명 : " + car2.model);
        System.out.println("색상 : " + car2.color);
        System.out.println();

        Car4 car3 = new Car4("화물용", "빨강", 200);
        System.out.println("회사명 : " + car3.company);
        System.out.println("모델명 : " + car3.model);
        System.out.println("색상 : " + car3.color);
        System.out.println("최고속도 : " + car3.maxSpeed);


    }


}
