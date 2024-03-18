package ch13.lecture.p1generic;

public class C09GenericMethod {
    public static void main(String[] args) {
        C07Box<String> box = new C07Box<>();
        method("hello");
        method(34);

    }

    public static <T> void method(T param) {

    }

    public static <T> T method1() {
        return null;
    }
}
