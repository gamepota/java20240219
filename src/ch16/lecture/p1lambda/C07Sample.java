package ch16.lecture.p1lambda;

public class C07Sample {
    public static void main(String[] args) {
        C07MyInterface obj1 = a ->
                System.out.println(a + a + a);

        C07MyInterface obj2 = a ->
                System.out.println(a + a);
        C07MyInterface obj3 = a -> {
            System.out.println(a.toUpperCase());
        };

        obj1.method("hi");
        obj2.method("hello");
        obj3.method("spring");

    }
}

interface C07MyInterface {
    void method(String a);
}
