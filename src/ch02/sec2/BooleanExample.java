package ch02.sec2;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("장비를 정지합니다.");
        } else {
            System.out.println(" 앙돼잖아?");
        }
//        ctrl+shift+enter 코드 완성
        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);

    }
}
