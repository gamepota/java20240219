package ch06.lecture.p2method;

import java.util.Random;

public class C10Return {
    public static void main(String[] args) {
        C10MyClass o = new C10MyClass();
        o.method1();

        int a = o.method1();
        int c = 10 / o.method1();
        System.out.println(o.method1());

        double b = o.method2();
        double d = 3.14 / o.method2();

        System.out.println("-----------------");
        System.out.println(o.method7(6));//1~6
        System.out.println(o.method7(45));//1~45
        System.out.println(o.method7(100));//1~100


    }
}

class C10MyClass {
    int method1() {
        return 5;
    }

    double method2() {
        return 3.14;
    }

    String method3() {
        return "hello";
    }

    long method4() {
        return 5;
    }

    double method5() {
        return 10;
    }
    // void: 반환하는 값이 없음
    //return을 메소드 종료 기능으로만 사용가능

    void method6() {
//        return 30;
    }

    int method7(int bound) {
        Random random = new Random();
        return random.nextInt();
    }
}
