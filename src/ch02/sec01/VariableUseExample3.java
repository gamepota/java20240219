package ch02.sec01;

public class VariableUseExample3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);

        int a = 100;
        int b = 200;
        System.out.println("a:" + a + ", b:" + b);

        int t = a;
        a = b;
        b = t;

        System.out.println("a:" + a + ", b:" + b);
    }
}
