package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new E();
        System.out.println(a instanceof A);//true
        System.out.println(a instanceof B);//true
        System.out.println(a instanceof C);//flase
        System.out.println(a instanceof D);//flase
        System.out.println(a instanceof E);//true
        System.out.println(a instanceof F);//false
    }
}

// @formatter:off // @formatter:on - 자동 포메팅 온오프
class A {}
class B extends A{}
class D extends B{}
class E extends B{}


class C extends A{}
class F extends C{}