package ch04.lecture.p2switch;

public class SwitchExpression {
    public static void main(String[] args) {
        //switch expression: java 12부터

        int value = 1;
// 스위치 문 작성후 alt enter로 힌트 보면 바꿀 수 있음
        switch (value) {
            case 1 -> System.out.println("statement1");
            case 3 -> {
                // 여러명령문이 존재하면 {}사용
                System.out.println("statement3");
                System.out.println("statement4");
                System.out.println("statement5");
                System.out.println("statement6");

            }
        }

        System.out.println("statement1");
        System.out.println("statement2");
        System.out.println("statement3");
        System.out.println("statement4");
        System.out.println("statement5");
        System.out.println("statement6");
    }
}
