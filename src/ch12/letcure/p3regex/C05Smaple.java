package ch12.letcure.p3regex;

public class C05Smaple {
    public static void main(String[] args) {
        //_,$, 영어 대소문자, 숫자조합
        // 숫자시작x

        String a = "[a-zA-Z$_][a-zA-Z0-9$_]+";

        System.out.println("num".matches(a));
        System.out.println("1gr$".matches((a)));
        System.out.println("$dgHk".matches((a)));

        String b = "\\D[a-zA-Z0-9$_]+";
        System.out.println("num".matches(b));
        System.out.println("1gr$".matches((b)));
        System.out.println("$dgHk".matches((b)));
        System.out.println("$_dW341Hk".matches((b)));
    }
}
