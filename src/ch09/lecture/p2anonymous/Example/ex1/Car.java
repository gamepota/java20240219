package ch09.lecture.p2anonymous.Example.ex1;

public class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식1 구른다");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식2가 구른다");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }

}
