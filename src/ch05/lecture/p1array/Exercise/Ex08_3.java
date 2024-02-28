package ch05.lecture.p1array.Exercise;

import java.util.Arrays;

public class Ex08_3 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };


        int sum = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .sum();

        double avg = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .average()
                .getAsDouble();

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}

