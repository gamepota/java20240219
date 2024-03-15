package ch12.letcure.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // 정규표현식; 특정 규칙의 문자열 표현하기위한 문자열 패턴

        //한문자

        String pattern1 = "a";

        boolean b1 = "a".matches(pattern1);//true
        System.out.println("b1 = " + b1);


        System.out.println("b".matches(pattern1));
        System.out.println("aa".matches(pattern1));
        System.out.println("aa".matches("aa"));
        System.out.println("ab".matches("ab"));
        System.out.println("ab".matches("ba"));

        System.out.println("\\".matches("\\\\"));
        // regex . : 모든 문자 한개
        System.out.println(".".matches("."));
        System.out.println("a".matches("."));
        System.out.println("C".matches("."));
        System.out.println("1".matches("."));
        System.out.println("abc".matches("."));


        System.out.println(".".matches("\\."));

        System.out.println(".".matches("\\."));
        System.out.println(".".matches("\\."));
    }
}
