package ch05.lecture.p1array.Example;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] Scores = {
                {80, 90, 96},
                {76, 88}
        };
        System.out.println("1차원 배열 길이(반의 수): " + Scores.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + Scores[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + Scores[1].length);

        System.out.println("scores[0][2]: " + Scores[0][2]);
        System.out.println("scores[1][1]: " + Scores[1][1]);

        int class1Sum = 0;
        for (int i = 0; i < Scores[0].length; i++) {
            class1Sum += Scores[0][i];

        }
        double class1Avg = (double) class1Sum / Scores[0].length;
        System.out.println(" 1반 평균: " + class1Avg);

        int class2Sum = 0;

        for (int i = 0; i < Scores[1].length; i++) {
            class2Sum += Scores[1][i];

        }
        double class2Avg = (double) class2Sum / Scores[1].length;
        System.out.println("2반 평균: " + class2Avg);

        int totalStudents = 0;
        int totalSum = 0;
        for (int i = 0; i < Scores.length; i++) {
            totalStudents += Scores[i].length;
            for (int j = 0; j < Scores[i].length; j++) {
                totalSum += Scores[i][j];

            }

        }
        double totalAvg = (double) totalSum / totalStudents;
        System.out.println(" 전체 반 평균: " + totalAvg);
    }
}

