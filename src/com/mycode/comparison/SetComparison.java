package com.mycode.comparison;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        long startHashSet = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i);
        }
        long addHashSet = System.nanoTime() - startHashSet;
        long startHashSet2 = System.nanoTime();
        hashSet.contains(5543);
        long hashSetContains = System.nanoTime() - startHashSet2;
        long startHashSet3 = System.nanoTime();
        hashSet.remove(4446);
        long hashSetRemove = System.nanoTime() - startHashSet3;
        long endhashSet = System.nanoTime() - startHashSet;

        long starLinkedtHashSet = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedHashSet.add(i);
        }
        long addLinkedHashSet = System.nanoTime() - startHashSet;
        long starLinkedtHashSet2 = System.nanoTime();
        linkedHashSet.contains(5543);
        long LinkedHashSetContains = System.nanoTime() - startHashSet2;
        long starLinkedtHashSet3 = System.nanoTime();
        linkedHashSet.remove(4446);
        long linkedHashSetRemove = System.nanoTime() - startHashSet3;
        long endlinkedHashSet = System.nanoTime() - startHashSet;

        long starTreeSet = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.add(i);
        }
        long addTreeSet = System.nanoTime() - starTreeSet;
        long starTreeSet2 = System.nanoTime();
        treeSet.contains(5543);
        long treeSetContains = System.nanoTime() - startHashSet2;
        long starTreeSet3 = System.nanoTime();
        treeSet.remove(4446);
        long treeSetRemove = System.nanoTime() - startHashSet3;
        long endtreeSet = System.nanoTime() - startHashSet;


        System.out.println("Working time of  HashSet is equal       " + endhashSet);
        System.out.println("Working time of  LinkedHashSet is equal " + endlinkedHashSet);
        System.out.println("Working time of  TreeSet is equal       " + endtreeSet);
        System.out.println("_________add element_________");
        System.out.println("Add time of  HashSet is equal       " + addHashSet);
        System.out.println("Add time of  LinkedHashSet is equal " + addLinkedHashSet);
        System.out.println("Add time of  TreeSet is equal       " + addTreeSet);
        System.out.println("_________contains element_________");
        System.out.println("time of  HashSet is equal       " + hashSetContains);
        System.out.println("time of  LinkedHashSet is equal " + LinkedHashSetContains);
        System.out.println("time of  TreeSet is equal       " + treeSetContains);
        System.out.println("_________remove element_________");
        System.out.println("Remove time of  HashSet is equal       " + hashSetRemove);
        System.out.println("Remove time of  LinkedHashSet is equal " + linkedHashSetRemove);
        System.out.println("Remove time of  TreeSet is equal       " + treeSetRemove);

    }
}
