package ch06.lecture.p1feild.Example;

public class CarExample2 {
    public static void main(String[] args) {
        ExCar myCar = new ExCar();
        System.out.println("제작회사:" + myCar.company);
        System.out.println("모델명:" + myCar.model);
        System.out.println("색깔:" + myCar.color);
        System.out.println("최고속도:" + myCar.maxSpeed);
        System.out.println("현재속도:" + myCar.speed);

    }
}

class ExCar {

    String company = "현대자동차";
    String model = "그렌저";
    String color = "검정";

    int maxSpeed = 350;

    int speed;
}
