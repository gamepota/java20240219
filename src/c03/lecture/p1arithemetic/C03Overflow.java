package c03.lecture.p1arithemetic;

public class C03Overflow {
    public static void main(String[] args) {
        //byte(1), short(2), int(4), long(8)
        // float(4), double(8)

        // overflow : 산술연산 시 저장공간의 한계를 넘어서 원하지 않는 값을 얻음
        // int가 표현할수 있는 최대숫자를 넘음 -> long으로 치환 후 그중 int 가 읽을 수 있는 만큼 읽음

        int a = 2_000_000_000;
        int b = 2_000_000_000;

        int c = a + b;
        System.out.println("c = " + c);

        //overflow 방지하려면
        // 적절한 데이터 타입을 선택해야함

        long d = 2_000_000_000L;
        Long e = 2_000_000_000L;

        long f = d + e;

        System.out.println("f = " + f);

    }
}
