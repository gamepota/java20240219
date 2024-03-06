package ch06.lecture.p5static;

public class C05Static {
}

class C05MyClass {
    //인스턴스 필드

    //static 필드
    static int age = 30;

    static double area = Math.PI * 10 * 10;

    //static block
    //static 멤버 chrl tjfwjddyd
    static {
        System.out.println("statement ....");
        System.out.println("statement ....");
        System.out.println("statement ....");
        System.out.println("statement ....");
//        method1();
        area = Math.PI * 10 * 10;
    } // 중요하지 않음

    //생성자

    //인스턴스 메소드

    //static 메소드(클래스 메소드)
}