package ch07.lecture.p1inheritance.Example;

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {
    public static void main(String[] args) {
        //promotion : 자동형변환
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        B b2 = e;
//        C c2 = d;

    }
}