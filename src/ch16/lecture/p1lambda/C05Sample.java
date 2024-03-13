package ch16.lecture.p1lambda;

public class C05Sample {
    public static void main(String[] args) {
        C05MyInterface obj1 = (double a, double b) ->
                System.out.println(a / b);

        C05MyInterface obj2 = (double a, double b) ->
                System.out.println(a % b);

        obj1.method(5.0, 3.0);
        obj2.method(5.0, 3.0);
    }
}


interface C05MyInterface {
    void method(double a, double b);
}