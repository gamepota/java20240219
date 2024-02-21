package c02.lecture.p02type;

public class C24Operation {
    public static void main(String[] args) {
        //1.  같은 타입끼리의 연산의 결과는 피연산자의 타입
        int a = 10;
        int b = 10;
        int c = a + b;// 연산결과 int

        long d = 10;
        long e = 10;
        long f = d + e; //연산결과 long

        //2. 다른 타입끼리의 연산의 결과는 큰타입

        int j = 10;
        double k = 3.14;
        double l = j + k; // 연산결과 double 변환의 특성상 그런듯

        //3. String 과 다른 타입 연산 결과는 String

        int m = 10;
        String n = "10";
        String o = m + n; // 연산 결과 String

        System.out.println("o = " + o);
    }
}
