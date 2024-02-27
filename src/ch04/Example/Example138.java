package ch04.Example;

import java.util.Scanner;

public class Example138 {
    public static void main(String[] args) {
        //1.

        //2.
//        String grade = "B";
//        int score1 = 0;
//        switch (grade) {
//            case "A":
//                score1 = 100;
//                break;
//            case "B":
//                int result = 100 -20;
//                score1 = result;
//                break;
//            default:
//                score1 = 60;
//        }

        String grade = "B";
        int score1 = 0;
        score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

        //3.
        int sum = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                sum += i;

            }


        }
        System.out.println("합계: " + sum);

        //5.


        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.print("(" + x + ", " + y + ")");
                }
            }
            System.out.println();

        }
        //7.

        Scanner scanner = new Scanner(System.in);
        boolean bank = true;

        while (bank) {
            System.out.println("----------------------------------");
            System.out.println(" 1.예금" + " | " + "2.출금" + " | " + "3.잔고" + " | " + "4.종료");
            System.out.println("----------------------------------");

        }


    }
}
