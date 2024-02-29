package ch05.lecture.p1array.Exercise;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean system = true;
        int[][] system2 = new int[0][0];

        while (system = true) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수" + " | " + "2.점수입력" + " | " + "3.점수리스트" + " | " + "4.분석" + " | " + "5.종료 ");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");

            String strNum = scanner.nextLine();

            switch (strNum) {
                case "1" -> {
                    System.out.print("학생수>");
                    String totalStudents = scanner.nextLine();
                    int total = Integer.parseInt(totalStudents);
                    system2 = new int[total][total];
                }

                case "2" -> {
                    System.out.print("점수>");
                    String scores = scanner.nextLine();
                    
                }

                case "3" -> {
                    System.out.print("리스트>");
                }

                case "4" -> {
                    System.out.print("최고점수>");
                    System.out.print("평균점수>");
                }

                case "5" -> {
                    system = false;
                }
            }
        }
    }
}
