package ch15.lecture.p5map.Exercise.p9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;
        Set<String> keys = map.keySet();
        int total = 0;

        for (String key : keys) {
            int score = map.get(key);
            total += score;
            if (score > maxScore) {
                maxScore = score;
                name = key;
            }
        }

        totalScore = total / map.size();


        System.out.println("평균 점수: " + totalScore);
        System.out.println("최고 점수: " + maxScore + " (이름: " + name + ")");


    }


}

