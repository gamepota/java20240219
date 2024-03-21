package ch15.lecture.p6of.Example;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList1 = List.of("A", "B", "C");
//        immutableList1.add("D");
        System.out.println(immutableList1);

        Set<String> immutableSet1 = Set.of("A", "B", "C");
//        immutableList2.remove("A");
        System.out.println(immutableSet1);

        Map<Integer, String> immutalbeMap1 = Map.of(
                1, "A",
                2, "B",
                3, "C");
//        immutalbeMap1.put(4, "D");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutalbeList2 = List.copyOf(list);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        String[] arr = {"A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);

    }
}
