package c03.lecture.p1arithemetic;

public class C01Arithmetic {
    public static void main(String[] args) {
        // 산술연산자
        // +,-,*,/,%
        //피연산자: numeric (정수,실수,문자)
        //연산결과의 타입: 피연산자 중 큰 타입

        int a = 2;
        int b = 9;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(b % a); // b를 a로나눈 나머지
    }
}
