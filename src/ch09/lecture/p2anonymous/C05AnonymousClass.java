package ch09.lecture.p2anonymous;

public class C05AnonymousClass {
    public static void main(String[] args) {
        C05Parent obj1 = new C05Parent() {

        }; // 하나의 인스턴스만 만들거면 상속하지 않고 익명 객체 사용
    }


    public static void method(C05Parent param) {

    }
}


abstract class C05Parent {
}