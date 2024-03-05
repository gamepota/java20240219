package ch06.lecture.p2method.example;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);
        if (myCar.isleftGas()) {
            System.out.println("출발합니다. 뿡빵띠");

            myCar.run();
        }
        System.out.println("gas를 주입해주세요");
    }
}
