package ch06.lecture.p6final;

public class C04Final {
    public static void main(String[] args) {
        C04MyClass.i = 30;
        C04MyClass.i = 40;
//        C04MyClass.k =20;
    }
}

class C04MyClass {
    //static field


    static int i;

    //final static field
    //final static field 작명 관습: UPPER_SNAKE_CASE

    final static int K = 30;

    final static int J;
    static final int AMOUNT_OF_MONEY = 300;

    static {
        J = 20;
    }
}