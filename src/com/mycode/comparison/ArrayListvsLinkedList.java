package com.mycode.comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListvsLinkedList {
    public static void main(String[] args) {
        List<Employee> arrayList = new ArrayList<>();
        List<Employee> linkedList = new LinkedList<>();

        Employee employee = new Employee(1,"Jany", "Kimberly",44444);
        Employee employee2 = new Employee(4,"Emily", "Wilson",50555);

        long startArrayList = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(employee);
        }
        long addArrayList = System.nanoTime() - startArrayList;
        arrayList.add(5555,employee2);
        long addIndexArrayList = System.nanoTime() - startArrayList;

        for (int i = 0; i < arrayList.size(); i++) {
            if (i / 4 == 0) {
                arrayList.remove(i);
            }
        }
        long removeArrayList = System.nanoTime() - startArrayList;

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, employee2);
        }
        long setArrayList = System.nanoTime() - startArrayList;
        arrayList.clear();
        long endArrayList = System.nanoTime() - startArrayList;

        long startLinkList = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(employee);
        }
        long addLinkList = System.nanoTime() - startLinkList;
        linkedList.add(5555, employee2);
        long addIndexLinkedList = System.nanoTime() - startLinkList;

        for (int i = 0; i < linkedList.size(); i++) {
            if (i / 4 == 0) {
                linkedList.remove(i);
            }
        }
        long removeLinkList = System.nanoTime() - startLinkList;
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.set(i, employee2);
        }
        long setLinkList = System.nanoTime() - startLinkList;
        linkedList.clear();
        long endLinkList = System.nanoTime() - startLinkList;


        System.out.println("Working time of  ArrayList is equal  "+endArrayList);
        System.out.println("Working time of  LinkedList is equal "+endLinkList);
        System.out.println("_________add element_________");
        System.out.println("Add time of  ArrayList is equal  "+addArrayList);
        System.out.println("Add time of  LinkedList is equal "+addLinkList);
        System.out.println("_________add element by index_________");
        System.out.println("Add time of  ArrayList is equal  "+addIndexArrayList);
        System.out.println("Add time of  LinkedList is equal "+addIndexLinkedList);
        System.out.println("_________remove element_________");
        System.out.println("Remove time of  ArrayList is equal  "+removeArrayList);
        System.out.println("Remove time of  LinkedList is equal "+removeLinkList);
        System.out.println("_________set element_________");
        System.out.println("Set time of  ArrayList is equal  "+setArrayList);
        System.out.println("Set time of  LinkedList is equal "+setLinkList);

    }
}
