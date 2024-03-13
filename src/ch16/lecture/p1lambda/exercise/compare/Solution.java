package ch16.lecture.p1lambda.exercise.compare;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (x, y) -> {
            if (x.charAt(n) == y.charAt(n)) {
                return x.compareTo(y);
            } else {
                return x.charAt(n) - y.charAt(n);
            }

        });


        return strings;
    }
}

