package ch08.lecture.p1interface.Example.service;

public interface Service {

    default void defaultMethod1() {
        System.out.println("defaltMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaltMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("defaltMethod 중복 코드1");
        System.out.println("defaltMethod 중복 코드2");
    }

    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드1");
        System.out.println("staticMethod 중복 코드2");

    }
}
