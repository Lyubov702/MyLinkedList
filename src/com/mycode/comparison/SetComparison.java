package com.mycode.comparison;

import java.util.*;

public class SetComparison {
    private static int size = 10000;

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("_________add element_________");
        System.out.println("Add time of  HashSet is equal       " + addElements(hashSet, size));
        System.out.println("Add time of  LinkedHashSet is equal " + addElements(linkedHashSet, size));
        System.out.println("Add time of  TreeSet is equal       " + addElements(treeSet, size));
        System.out.println("_________contains element_________");
        System.out.println("time of  HashSet is equal       " + containsKey(hashSet, 4999));
        System.out.println("time of  LinkedHashSet is equal " + containsKey(linkedHashSet, 4999));
        System.out.println("time of  TreeSet is equal       " + containsKey(treeSet, 4999));
        System.out.println("_________remove element_________");
        System.out.println("Remove time of  HashSet is equal       " + removeElement(hashSet, 4446));
        System.out.println("Remove time of  LinkedHashSet is equal " + removeElement(linkedHashSet, 4446));
        System.out.println("Remove time of  TreeSet is equal       " + removeElement(treeSet, 4446));
        System.out.println("_________clear set_________");
        System.out.println("Clear time of  HashSet is equal       " + clearSet(hashSet));
        System.out.println("Clear time of  LinkedHashSet is equal " + clearSet(linkedHashSet));
        System.out.println("Clear time of  TreeSet is equal       " + clearSet(treeSet));
    }

    private static long clearSet(Set<Integer> set) {
        long start = System.nanoTime();
        set.clear();
        long result = System.nanoTime() - start;
        return result;
    }

    private static long removeElement(Set<Integer> set, int key) {
        long start = System.nanoTime();
        set.remove(key);
        long result = System.nanoTime() - start;
        return result;
    }

    private static long containsKey(Set<Integer> set, int index) {
        long start = System.nanoTime();
        set.contains(index);
        long result = System.nanoTime() - start;
        return result;
    }

    private static long addElements(Set<Integer> set, int size) {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        long result = System.nanoTime() - start;
        return result;
    }
}