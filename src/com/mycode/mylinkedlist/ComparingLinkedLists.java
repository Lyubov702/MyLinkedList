package com.mycode.mylinkedlist;

import java.util.LinkedList;
import java.util.List;

public class ComparingLinkedLists {
    public static void main(String[] args) {
        MyLinkedList<String> mylist = new MyLinkedList<>();
        List<String> list = new LinkedList<>();
        long startMyColl = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            mylist.add("string");
        }
        for (int i = 0; i < mylist.size(); i++) {
            if (i / 2 == 0) {
                mylist.remove(i);
            }
        }
        for (int i = 0; i < mylist.size(); i++) {
            mylist.set(i, "new item");
        }
        mylist.clear();
        long endMyColl = System.nanoTime() - startMyColl;

        long startLinkList = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add("string");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i / 2 == 0) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "new item");
        }
        list.clear();
        long endLinkList = System.nanoTime() - startLinkList;

        System.out.println("Working time of myLinkedList is equal "+endMyColl);
        System.out.println("Working time of  LinkedList is equal  "+endLinkList);

    }
}
