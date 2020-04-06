package com.mycode.mylinkedlist;

import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList= new MyLinkedList<>();
        for (int i = 0; i < 14; i++) {
            myLinkedList.add(i);
        }

        System.out.println("MyLinkedList: " + myLinkedList);
        myLinkedList.add(4, 4);
        System.out.println("MyLinkedList: " + myLinkedList);
        System.out.println("Size= " + myLinkedList.size());
        System.out.println("Get index of 10 element  "+myLinkedList.get(10));
        System.out.println("Get 19 element  "+myLinkedList.indexOf(19));
        System.out.println("Remove 9 element  "+myLinkedList.remove(9));
        Iterator<Integer> iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"  ");
        }
        System.out.println("Size= " + myLinkedList.size());
        System.out.println(myLinkedList.set(7,21));
        myLinkedList.forEach(System.out::println);
        myLinkedList.clear();

//
//        System.out.println("=================");
//        System.out.println("List 1 = " + myLinkedList);
//        System.out.println("Create a new list from list1");
//        MyLinkedList<Integer> list2 = new MyLinkedList<>(myLinkedList);
//        System.out.println("List 2 = " + list2);
//        System.out.println("=================");
//
//        System.out.println("list.equals(list2) " + myLinkedList.equals(list2));
//        System.out.println("list == list2 " + (myLinkedList == list2));
//
//        System.out.println("list.hashCode() == list2.hashCode() " + (myLinkedList.hashCode() == list2.hashCode()));
//        System.out.println("Clear list1 and list2");


    }
}
