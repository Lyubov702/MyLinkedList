package com.mycode.comparison;

import java.util.*;

public class MapComparison {
    private static int size = 10000;

    public static void main(String[] args) {
        Map<Integer, Employee> hashMap = new HashMap<>();
        Map<Integer, Employee> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Employee> treeMap = new TreeMap<>();

        System.out.println("____________________add element_________________________");
        System.out.println("Add time of  HashMap is equal              " + addElements(hashMap, size));
        System.out.println("Add time of  LinkedHashMap is equal        " + addElements(linkedHashMap, size));
        System.out.println("Add time of  TreeMap is equal              " + addElements(treeMap, size));
        System.out.println("__________________contains element______________________");
        System.out.println("time of  HashMap is equal                  " + containsKey(hashMap, 5555));
        System.out.println("time of  LinkedHashMap is equal            " + containsKey(linkedHashMap, 5555));
        System.out.println("time of  TreeMap is equal                  " + containsKey(treeMap, 5555));
        System.out.println("__________________remove element__________________________");
        System.out.println("Remove time of  HashMap is equal          " + removeElement(hashMap, 4999));
        System.out.println("Remove time of  LinkedHashMap is equal    " + removeElement(linkedHashMap, 4999));
        System.out.println("Remove time of  TreeMap is equal          " + removeElement(treeMap, 4999));
        System.out.println("__________________clear map__________________________");
        System.out.println("Clear time of  HashMap is equal          " + clearMap(hashMap));
        System.out.println("Clear time of  LinkedHashMap is equal    " + clearMap(linkedHashMap));
        System.out.println("Clear time of  TreeMap is equal          " + clearMap(treeMap));
    }

    private static long clearMap(Map<Integer, Employee> map) {
        long start = System.nanoTime();
        map.clear();
        long result = System.nanoTime() - start;
        return result;
    }

    private static long removeElement(Map<Integer, Employee> map, int key) {
        long start = System.nanoTime();
        map.remove(key);
        long result = System.nanoTime() - start;
        return result;
    }

    private static long containsKey(Map<Integer, Employee> map, int index) {
        long start = System.nanoTime();
        map.containsKey(index);
        long result = System.nanoTime() - start;
        return result;
    }

    private static long addElements(Map<Integer, Employee> map, int size) {
        Employee employee = new Employee(1, "Jany", "Kimberly", 44444);
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            map.put(i, employee);
        }
        long result = System.nanoTime() - start;
        return result;
    }
}