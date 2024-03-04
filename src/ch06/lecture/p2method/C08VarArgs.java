package ch06.lecture.p2method;

public class C08VarArgs {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
        o1.method();
        o1.method(1);
        o1.method(3, 3);
//        o1.method(3,3,3);

        o1.method2();
        o1.method2(5);
        o1.method2(6, 7);
        o1.method2(8, 9, 10);
        o1.method2();
    }
}

class C08MyClass {
    void method() {
        System.out.println("C08Class.method1, 파라미터 없음");
    }

    void method(int a) {
        System.out.println("C08Class.method1, 파라미터 한개");
    }

    void method(int a, int b) {
        System.out.println("C08Class.method1, 파라미터 두개");
    }

    // varargs (가변인자, 가변길이 매개변수)
    // 메소드 내에서 배열로 사용
    void method2(int... a) {
        System.out.println("C08Class.method2, 파라미터 0개이상");
        System.out.println(a.length);
    }

    // 다른 파라미터와 함께 사용시 꼭 마지막에 넣어야 함
//    void method3(int...a, String s) {} 안됨
    void method3(String s, int... a) {
    }

    void method4(String s, double a, int... b) {
    }
}