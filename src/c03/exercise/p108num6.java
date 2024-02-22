package c03.exercise;

public class p108num6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean result1 = x > 7 && y <= 5;
        boolean result2 = x % 3 == 2 || y % 2 != 1;

        System.out.println((x > 7) && (y <= 5));
        System.out.println((x % 3 == 2) || (y % 2 != 1));


    }
}
