package ch04.Example;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {

            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
            System.out.println("프로그램 종류");

        }
    }
}
