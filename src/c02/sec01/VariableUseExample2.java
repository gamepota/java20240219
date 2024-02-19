package c02.sec01;

public class VariableUseExample2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" +y);

        int temp =x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" +y);

        int a = 100;
        int b = 200;

        int t = a;
        int k = b;
        a = b;
        b = a;

        System.out.println(a);
        System.out.println(b);
        //dkanrjsk


    }
    }

