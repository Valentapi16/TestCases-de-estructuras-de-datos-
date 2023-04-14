package model;

import java.util.LinkedList;

public class Queue<E> implements IQueue<E> {
    private LinkedList<E> list;

    public Queue() {
        list = new LinkedList<>();
    }

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeue() {
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

