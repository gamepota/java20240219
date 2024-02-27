package ch04.lecture.p4for;

public class C05ForExercise2 {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         */

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*

         *
         **
         ***
         ****
         *****

         */
        for (int a = 0; a <= 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *****
         ****
         ***
         **
         *

         */
        System.out.println("-----------------------");
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < (5 - a); b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        /*

        *****
        ****#
        ***##
        **###
        *####
        #####

         */
        for (int a = 0; a < 5; a++) {
        }


    }
}
