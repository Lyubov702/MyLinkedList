package com.mycode.comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListvsLinkedList {
    private  static  int size = 10000;

    public static void main(String[] args) {
        List<Employee> arrayList = new ArrayList<>();
        List<Employee> linkedList = new LinkedList<>();

        System.out.println("_________add element_________");
        System.out.println("Add time of  ArrayList is equal  " + addElements(arrayList, size));
        System.out.println("Add time of  LinkedList is equal " + addElements(linkedList, size));
        System.out.println("_________add element by index_________");
        System.out.println("Add time of  ArrayList is equal  " + addingByIndex(arrayList));
        System.out.println("Add time of  LinkedList is equal " + addingByIndex(linkedList));
        System.out.println("_________remove element_________");
        System.out.println("Remove time of  ArrayList is equal  " + removeElements(arrayList));
        System.out.println("Remove time of  LinkedList is equal " + removeElements(linkedList));
        System.out.println("_________set element_________");
        System.out.println("Set time of  ArrayList is equal  " + setElements(arrayList));
        System.out.println("Set time of  LinkedList is equal " + setElements(linkedList));
        System.out.println("_________clear list_________");
        System.out.println("Clear time of  ArrayList is equal  " + clearList(arrayList));
        System.out.println("Clear time of  LinkedList is equal " + clearList(linkedList));
        System.out.print("Total operating time of arrayList= ");
        System.out.println(addElements(arrayList, size)+addingByIndex(arrayList)
                +removeElements(arrayList)+setElements(arrayList)+clearList(arrayList));
        System.out.print("Total operating time of linkedList= ");
        System.out.println(addElements(linkedList, size)+addingByIndex(linkedList)
                +removeElements(linkedList)+setElements(linkedList)+clearList(linkedList));
    }

    private static long clearList(List<Employee> list) {
        long start = System.nanoTime();
        list.clear();
        long result = System.nanoTime() - start;

        return result;
    }

    private static long setElements(List<Employee> list) {
        Employee newEmployee = new Employee(792, "Harry", "Potter", 501555);

        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, newEmployee);
        }
        long result = System.nanoTime() - start;

        return result;
    }

    private static long removeElements(List<Employee> list) {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            if (i / 4 == 0) {
                list.remove(i);
            }
        }
        long result = System.nanoTime() - start;

        return result;
    }

    private static long addingByIndex(List<Employee> list) {
        int index = 5555;
        Employee employee2 = new Employee(4, "Emily", "Wilson", 50555);
        long start = System.nanoTime();
        list.add(index, employee2);
        long result = System.nanoTime() - start;

        return result;
    }

    private static long addElements(List<Employee> list, int size) {
        Employee employee = new Employee(1, "Jany", "Kimberly", 44444);
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(employee);
        }
        long result = System.nanoTime() - start;

        return result;
    }
}
