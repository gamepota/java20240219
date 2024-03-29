package ch16.lecture.p1lambda;

public class C06Lambda {
    public static void main(String[] args) {
        C06MyInterface obj1 = a -> {
            System.out.println(a);
            System.out.println("C06lambda.main");
        };

        C06MyInterface obj = num -> {
            System.out.println(num);
            System.out.println("C06");
        };
        C06MyInterface obj3 = a -> System.out.println(a);
        C06MyInterface obj4 = num -> System.out.println(num);
    }
}

// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
interface C06MyInterface {
    void method(int a);
}