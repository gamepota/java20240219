package ch16.lecture.p1lambda;

public class C09Lambda {
    public static void main(String[] args) {
        C09MyInterface obj1 = new C09MyInterface() {
            @Override
            public int method() {
                System.out.println("staement...");
                return 0;
            }
        };

        C09MyInterface obj2 = new C09MyInterface() {
            @Override
            public int method() {
                System.out.println("staement...");
                return 0;
            }
        };
    }
}

// 4. 리턴 있는 추상 메소드
interface C09MyInterface {
    int method();
}