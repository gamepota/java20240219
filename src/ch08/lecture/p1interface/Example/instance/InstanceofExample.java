package ch08.lecture.p1interface.Example.instance;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);

    }

    public static void ride(Vehicle vehicle) {
//        if (vehicle instanceof Bus) {
//            Bus bus = (Bus) vehicle;
//            bus.checkFare();
//        }  // 매개값이 Bus인 경우에만 강제 타입 변환 후 메소드 호출

        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }
        vehicle.run();
    }
}
