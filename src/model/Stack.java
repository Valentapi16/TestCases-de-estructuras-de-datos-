package model;

import java.util.LinkedList;

public class Stack<E> implements IStack<E> {
    private LinkedList<E> list;

    public Stack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }

        return list.removeFirst();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}

