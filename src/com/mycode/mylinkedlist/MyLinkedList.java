package com.mycode.mylinkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E> {

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    @Override
    public void add(E element) {
        Node<E> prev = lastNode;
        Node<E> newNode = new Node<>(element, null, prev);
        lastNode = newNode;
        if (prev != null) {
            prev.next = newNode;
        } else {
            firstNode = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> newNode = new Node<>(element, pos(index), pos(index).prev);
        pos(index - 1).next = newNode;
        pos(index).prev = newNode;
        size++;
    }

    private Node<E> pos(int index) {
        Node<E> node;
        if (index < (size >> 1)) {
            node = firstNode;
            for (int i = 0; i < index; i++)
                node = node.next;
        } else {
            node = lastNode;
            for (int i = size - 1; i > index; i--)
                node = node.prev;
        }
        return node;
    }

    @Override
    public void clear() {
        Node<E> node = firstNode;
        while (node != null) {
            Node<E> next = node.next;
            node.prev = null;
            node.item = null;
            node.next = null;
            node = next;
        }
        size = 0;
        firstNode = lastNode = null;
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index <= size) {
            return pos(index).item;
        } else return null;
    }

    @Override
    public int indexOf(E element) {
        int i = 0;
        for (Node<E> node = firstNode; node.next != null; )
            if (node.item.equals(element)) return i;
            else {
                i++;
                node = node.next;
            }
        return -1;
    }

    @Override
    public E remove(int index) {
        Node<E> e = pos(index);
        E x = e.item;
        Node<E> next = e.next;
        Node<E> prev = e.prev;

        if (prev == null) {
            firstNode = next;
        } else {
            prev.next = next;
            e.prev = null;
        }

        if (next == null) {
            lastNode = prev;
        } else {
            next.prev = prev;
            e.next = null;
        }
        e.item = null;
        size--;
        return x;
    }

    @Override
    public E set(int index, E element) {
        if (index >= 0 && index <= size) {
            return pos(index).item = element;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        int i = 0;
        Object[] array = new Object[size];
        for (Node<E> node = firstNode; node != null; node = node.next) {
            array[i] = node.item;
            i++;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int i = 0;
        T[] result = a;
        for (Node<E> x = firstNode; x != null; x = x.next)
            result[i++] = (T) x.item;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }


    @Override
    public Iterator<E> iterator() {
        return new myIterator<E>();
    }

    private class myIterator<E> implements Iterator<E> {

        private Node<E> lastReturned;
        private Node<E> next;
        private int nextIndex;

        public myIterator() {
            if (size == 0) {
                next = null;
            } else {
                next = (Node<E>) pos(nextIndex);
            }
            nextIndex++;
        }

        @Override
        public boolean hasNext() {
            return (nextIndex <= size);
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

    }

    public void forEach(Consumer<? super E> action) {
        Consumer<E> consumer = action::accept;
        for (int i = 0; i < size; i++) {
            consumer.accept(pos(i).item);
        }
    }
}
