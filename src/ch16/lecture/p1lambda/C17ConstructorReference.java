package ch16.lecture.p1lambda;

public class C17ConstructorReference {
    public static void main(String[] args) {
        C17MyInterface1 obj1 = C17Myclass::new;
        C17MyInterface2 obj2 = C17Myclass::new;

    }
}

class C17Myclass {
    C17Myclass() {

    }

    C17Myclass(String s, int i) {

    }

}

@FunctionalInterface
interface C17MyInterface1 {
    C17Myclass method();
}

interface C17MyInterface2 {
    C17Myclass method(String s, int i);
}