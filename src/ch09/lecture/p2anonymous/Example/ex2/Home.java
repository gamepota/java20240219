package ch09.lecture.p2anonymous.Example.ex2;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV 켬");
        }

        @Override
        public void turnOff() {
            System.out.println("TV 끔");

        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 켬");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 끔");

            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
