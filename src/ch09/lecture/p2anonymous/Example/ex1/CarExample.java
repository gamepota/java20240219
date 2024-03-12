package ch09.lecture.p2anonymous.Example.ex1;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();

        car.run2();

        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식3이 구른다");
            }
        });
    }
}
