package ch04.Example;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }

        String s = (score >= 90) ? "점수가 90보다 큽니다.\n등급은 A입니다. " : "점수가 90점 보다 작습니다.\n등급은 B입니다.";

        System.out.println(s); // 이건 따로 해봤는데 되네
    }
}

