package ch04.Example;

public class P138N4 {
    public static void main(String[] args) {


        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            System.out.print("(" + dice1 + "," + dice2 + ")");
            if (dice1 + dice2 == 5) {
                break;
            }
            System.out.println();
        }

        int num1 = 0;
        int num2 = 0;

        while (num1 + num2 != 5) {
            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;
            System.out.println(STR."(\{num1},\{num2}");
        }


    }

}

