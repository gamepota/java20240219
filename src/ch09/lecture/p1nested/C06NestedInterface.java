package ch09.lecture.p1nested;

public class C06NestedInterface implements C06MyClass.C06NestedInterface {
}

class C06MyClass {
    //중첩 클래스, 인터페이스
    interface C06NestedInterface {

    }

    //필드, 생성자, 메소드

    void method1() {
        class LoclaClass implements C06NestedInterface {

        }
    }
}