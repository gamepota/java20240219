package ch16.lecture.p1lambda.exercise.p07;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((x, y) -> {
            for (int i : scores) {
                x = Math.max(x, i);
            }


            return x;
        });
        System.out.println("최대값: " + max);

        int min = maxOrMin((x, y) -> {
            for (int i : scores) {
                y = Math.min(y, i);
            }


            return y;
        });
        System.out.println("최소값: " + min);
    }


}
