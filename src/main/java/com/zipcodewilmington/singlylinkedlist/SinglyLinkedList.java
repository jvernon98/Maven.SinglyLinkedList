package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <T extends Comparable> {
    Node<T> head;

    public void add(T value) {
        if (head == null) {
            head = new Node<T>(value);
        } else {
            Node<T> current = head;
            while (current != null) {
                current = current.next;

            }
            current.setNext(new Node<T>(value));
        }
    }

    public boolean contains(T expected){

        return false;
    }
}