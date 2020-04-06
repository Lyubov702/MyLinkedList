package com.mycode.comparison;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison {

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Jany", "Kimberly",44444);
        Employee employee2 = new Employee(4,"Emily", "Wilson",50555);

        Map<Integer, Employee> hashMap = new HashMap<>();
        Map<Integer,Employee> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Employee> treeMap = new TreeMap<>();

        long startHashMap = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashMap.put(i,employee);
        }
        long addHashMap = System.nanoTime() - startHashMap;
        long startHashMap2 = System.nanoTime();
        hashMap.containsKey(5543);
        long hashMapContains = System.nanoTime() - startHashMap2;
        long startHashMap3 = System.nanoTime();
        hashMap.remove(4446);
        long hashMapRemove = System.nanoTime() - startHashMap3;
        long endhashMap = System.nanoTime() - startHashMap;


        long starLinkedtHashMap = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedHashMap.put(i,employee);
        }
        long addLinkedHashMap = System.nanoTime() - startHashMap;
        long starLinkedtHashMap2 = System.nanoTime();
        linkedHashMap.containsKey(5543);
        long LinkedHashMapContains = System.nanoTime() - startHashMap2;
        long starLinkedtHashMap3 = System.nanoTime();
        linkedHashMap.remove(4446);
        long linkedHashMapRemove = System.nanoTime() - startHashMap3;
        long endlinkedHashMap = System.nanoTime() - startHashMap;


        long starTreeMap = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeMap.put(i,employee);
        }
        long addTreeMap = System.nanoTime() - starTreeMap;
        long starTreeMap2 = System.nanoTime();
        treeMap.containsKey(5543);
        long treeMapContains = System.nanoTime() - startHashMap2;
        long starTreeMap3 = System.nanoTime();
        treeMap.remove(4446);
        long treeMapRemove = System.nanoTime() - startHashMap3;
        long endtreeMap = System.nanoTime() - startHashMap;


        System.out.println("Working time of  HashMap is equal         " + endhashMap);
        System.out.println("Working time of  LinkedHashMap is equal   " + endlinkedHashMap);
        System.out.println("Working time of  TreeMap is equal         " + endtreeMap);
        System.out.println("____________________add element_________________________");
        System.out.println("Add time of  HashMap is equal              " + addHashMap);
        System.out.println("Add time of  LinkedHashMap is equal        " + addLinkedHashMap);
        System.out.println("Add time of  TreeMap is equal              " + addTreeMap);
        System.out.println("__________________contains element______________________");
        System.out.println("time of  HashMap is equal                  " + hashMapContains);
        System.out.println("time of  LinkedHashMap is equal            " + LinkedHashMapContains);
        System.out.println("time of  TreeMap is equal                  " + treeMapContains);
        System.out.println("__________________remove element__________________________");
        System.out.println("Remove time of  HashMap is equal          " + hashMapRemove);
        System.out.println("Remove time of  LinkedHashMap is equal    " + linkedHashMapRemove);
        System.out.println("Remove time of  TreeMap is equal          " + treeMapRemove);

    }

}

