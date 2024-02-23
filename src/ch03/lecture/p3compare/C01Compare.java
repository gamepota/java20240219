package ch03.lecture.p3compare;

public class C01Compare {
    public static void main(String[] args) {
        // 비교 연산자
        // == 같다, != 같지 않다, > 크다,>= 크거나 같다, <, <=
        //setting 건들이면 수학기호로 변환가능
        // 연산결과 : boolean (true, false)
        // 다른 타입간 연산 가능 ( 하지만 같은 타입끼리 계산 권장)

        int a = 5;
        int b = 8;

        boolean b1 = a == b;
        System.out.println("b1 =" + b1);
        boolean b2 = a != b;
        System.out.println("b2 =" + b2);
        boolean b3 = a < b;
        System.out.println("b3 =" + b3);
        boolean b4 = a <= b;
        System.out.println("b4 =" + b4);
        boolean b5 = a > b;
        System.out.println("b5 =" + b5);
        boolean b6 = a >= b;
        System.out.println("b6 =" + b6);
        System.out.println("b6 =" + b6);
    }
}
