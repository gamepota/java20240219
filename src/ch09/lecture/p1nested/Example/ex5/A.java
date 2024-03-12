package ch09.lecture.p1nested.Example.ex5;

public class A {
    A() {
        class B {
        }

        B b = new B();

    }

    void method() {
        class B {

        }

        B b = new B();
    }
}
