package ch15.lecture.p5map.Example.p658;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 89);
        map.put("곽달삭", 90);
        map.put("이경봉", 99);
        map.put("곽달삭", 95);
        System.out.println("총 entry 수: " + map.size());
        System.out.println();

        String key = "곽달삭";
        int value = map.get(key);
        System.out.println(key + ":" + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ":" + v);

        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ":" + v);
        }
        System.out.println();

        map.remove("곽달삭");
        System.out.println("총 entry 수:" + map.size());
        System.out.println();
    }
}
