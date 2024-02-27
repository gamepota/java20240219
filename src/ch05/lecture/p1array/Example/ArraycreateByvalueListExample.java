package ch05.lecture.p1array.Example;

public class ArraycreateByvalueListExample {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 :" + sum1);
        printItem(new int[]{83, 90, 87});
    }

    private static void printItem(int[] ints) {
    }
}
