package ch04.Example;

public class SwitchChar {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {

            case 'A':
            case 'a':
                System.out.println("우수회원입니다.");

                break;

            case 'B', 'b':
                System.out.println("일반회원입니다.");

                break;

            case 'c', 'C':
                System.out.println("나가");
        }
    }
}
