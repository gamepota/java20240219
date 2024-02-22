package c03.sec3;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }
        System.out.println("--------------------------------------");

        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;
            System.out.println("var2: " + var2);

            // 위아래 각각 반복을 거쳐 byte의 표현 범위 -128~127을 넘었다.
        }
    }
}
