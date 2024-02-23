package ch03.sec5;

public class ConditionalOpereationExample {
    public static void main(String[] args) {
        int score = 85;

        char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.println(score + "점은 " + grade + "등급 입니다. ");

    }
}
