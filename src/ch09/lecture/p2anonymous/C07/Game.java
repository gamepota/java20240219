package ch09.lecture.p2anonymous.C07;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Play field = new Play() {
        @Override
        public void play() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int user = Integer.parseInt(scanner.nextLine());
            int computer = random.nextInt(1, 4);
            switch (user) {
                case 1 -> System.out.println("user = 가위");
                case 2 -> System.out.println("user = 바위");
                case 3 -> System.out.println("user = 보");

            }

            switch (computer) {
                case 1 -> System.out.println("computer = 가위");
                case 2 -> System.out.println("computer = 바위");
                case 3 -> System.out.println("computer = 보");


            }
            if (user == computer) {
                System.out.println("비겼습니다. ");
            } else if (user == 1 && computer == 3) {
                System.out.println("사용자가 이겼습니다. 🎉");
            } else if (user == 2 && computer == 1) {
                System.out.println("사용자가 이겼습니다. 🎉");
            } else if (user == 3 && computer == 2) {
                System.out.println("사용자가 이겼습니다. 🎉");
            } else {
                System.out.println("사용자가 졌습니다. 😭");
            }

        }
    };

    void method1() {
        Play lottogame = new Play() {
            int count = 6;
            int a[] = new int[count];
            Random r = new Random();

            @Override
            public void play() {

                for (int i = 0; i < count; i++) {
                    a[i] = r.nextInt(1, 46);
                    for (int j = 0; j < i; j++) {
                        if (a[i] == a[j]) {
                            i--;
                        }

                    }


                }
                for (int i = 0; i < count; i++) {
                    System.out.println("로또 번호" + (i + 1) + " : " + a[i]);

                }

            }

        };
        lottogame.play();
    }

}
