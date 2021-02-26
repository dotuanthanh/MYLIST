package com.company;

import javax.lang.model.element.Element;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void reSize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void add(E e) {
        if (size == elements.length) {
            reSize();
        }
    }

    public E get(int i) {
        if (i > size || i < 0) {
            return null;
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {


        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

        listInteger.get(6);
        System.out.println("element 6: " + listInteger.get(6));
    }
}