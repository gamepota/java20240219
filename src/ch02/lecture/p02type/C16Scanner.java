package ch02.lecture.p02type;

import java.util.Scanner;

public class C16Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//키보드 입력 받음

        String line = scanner.nextLine();
        System.out.println("line =" + line);

        scanner.close();
    }

}
