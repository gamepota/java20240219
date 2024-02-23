package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C04RPS {
    public static void main(String[] args) {
        // 가위바위보 게임

        Scanner scanner = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요.");

        String strU = scanner.nextLine();

        int user = Integer.parseInt(strU);


        Random random = new Random();
        int computer = random.nextInt(1, 4);

        switch (user) {

            case 1:
                System.out.println("user = 가위 ");

                break;
            case 2:
                System.out.println("user = 바위 ");

                break;
            case 3:
                System.out.println("user = 보 ");

                break;
        }

        switch (computer) {

            case 1:
                System.out.println("computer = 가위 ");
                break;

            case 2:
                System.out.println("computer = 바위 ");
                break;

            case 3:
                System.out.println("computer = 보 ");
                break;
        }
        

        if (user == 1 && computer == 3) {
            System.out.println("사용자의 승리입니다.");
        } else if (user == 3 && computer == 1) {
            System.out.println("사용자의 패배입니다.");
        } else if (user == computer) {
            System.out.println("무승부입니다.");
        } else if (user < computer) {
            System.out.println("사용자의 패배입니다.");
        } else if (user > computer) {
            System.out.println("사용자의 승리입니다.");
        }


    }
}
