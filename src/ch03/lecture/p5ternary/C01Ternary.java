package ch03.lecture.p5ternary;

public class C01Ternary {
    public static void main(String[] args) {
        //삼항연산자 (Ternary Operator, 조건 연산자, Conditional operator)
        //피연산자 갯수 : 3개

        // 기호
        // ? :
        //문법
        //피연산자1 ? 피연산자2 : 피연산자3

        //연산결과값은: 피연산자2 또는 피연산자3
        // 피연산자1 타입은 boolean
        //피연산자2,3의 타입은 같아야함

        int r1 = true ? 1 : 2;
        System.out.println(" r1 = " + r1);

        int r2 = false ? 1 : 2;
        System.out.println(" r2 = " + r2);

        int age = 30;
        String r3 = (age >= 20) ? "어른" : "아이";
        System.out.println("r3 = " + r3);

        int age1 = 15;

        String r4 = (age1 >= 20) ? "어른" : "아이";
        System.out.println(" r4 = " + r4);


    }
}
