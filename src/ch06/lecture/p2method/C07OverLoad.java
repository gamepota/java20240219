package ch06.lecture.p2method;

public class C07OverLoad {
    public static void main(String[] args) {
        C07MyClass o1 = new C07MyClass();


        o1.method(3);
        o1.method(3.14);
    }
}

class C07MyClass {
    // 파라미터의 갯수,  타입이 다른
    //같은 이름의 메소드 작성 가능

    void method(int a) {
    }

    void method(double a) {
    }

    void method(double a, double b) {
    }

    void method(double a, double b, double c) {
    }

    void method(double a, int b) {
    }
}
