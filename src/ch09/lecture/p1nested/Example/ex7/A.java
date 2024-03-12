package ch09.lecture.p1nested.Example.ex7;

public class A {
    public void method1(int arg) {
        int gar = 1;

        class B {
            void method2() {
                System.out.println("arg: " + arg);
                System.out.println("gar: " + gar);

//                arg = 2;
//                gar = 2;
            }
        }

        B b = new B();

        b.method2();

        //                arg = 2;
//                gar = 2;
    }
}
