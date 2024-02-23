package ch04.lecture.p2switch;

public class C02Switch {
    public static void main(String[] args) {
        //break 생략시 계속 연달아 실행됨

        String city = "seoul";

        switch (city) {
            case "seoul":
                System.out.println("statement 2");

            case "busan":
                System.out.println("statement 3");

            case "jeju":
                System.out.println("statement 3");
        }
    }
}
