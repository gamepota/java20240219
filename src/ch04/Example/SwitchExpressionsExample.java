package ch04.Example;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a':
                System.out.println("우수 회원입니다.");
                break;

            case 'B', 'b':
                System.out.println("일반 회원입니다.");
                break;

            case 'C', 'c':
                System.out.println("넌 나가라.");
                break;
        }
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            case 'C', 'c' -> System.out.println("넌 나가라.");
        }


    }
}
