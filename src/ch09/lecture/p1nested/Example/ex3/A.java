package ch09.lecture.p1nested.Example.ex3;

public class A {
    class B {

    }

    B field = new B();

    A() {
        B b = new B();
    }

    void method() {
        B b = new B();
    }

}
