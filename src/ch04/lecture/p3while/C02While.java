package ch04.lecture.p3while;

public class C02While {
    public static void main(String[] args) {
        System.out.println("statement 1");

        int i = 0;

        while (i < 3) {
            System.out.println("statement 2");
            System.out.println("statement 3");
            i++;// 반복할때마다 i가 1증가, 즉 조건문이 언젠가는 false가 됨.
        }
        System.out.println("statement 4");
    }
}
