package ch05.lecture.p1array;

import java.util.Scanner;

public class C22Scanner {
    public static void main(String[] args) {


//        if (scanner.hasNext()){
//            String token1 = scanner.next();
//            System.out.println(token1);
//        }
//        if (scanner.hasNext()){
//            String token2 = scanner.next();
//            System.out.println(token2);
//        }
//        if (scanner.hasNext()){
//            String token3 = scanner.next();
//            System.out.println(token3);
//        }
//
//        if (scanner.hasNext()){
//            String token4 = scanner.next();
//            System.out.println(token4);
//        }
//        if (scanner.hasNext()){
//            String token5 = scanner.next();
//            System.out.println(token5);
//        }
//        if (scanner.hasNext()){
//            String token6 = scanner.next();
//            System.out.println(token6);
//        }
//        if (scanner.hasNext()){
//            String token7 = scanner.next();
//            System.out.println(token7);
//        }


        String s = "your name is lee.";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }
    }
}
