package ch05.lecture.p2string.Example;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }

        if (hobby.isEmpty()) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }

        if (hobby.isBlank()) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
