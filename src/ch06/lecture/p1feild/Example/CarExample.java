package ch06.lecture.p1feild.Example;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        //필드에 값을 넣지 않으면 0,flase, null
        //p.214 표참조

        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
    }
}
