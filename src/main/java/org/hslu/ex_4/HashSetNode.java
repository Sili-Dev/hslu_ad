package org.hslu.ex_4;

public class HashSetNode<T> {
    private final T value;
    private HashSetNode<T> next;

    public HashSetNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public HashSetNode<T> getNext() {
        return next;
    }

    public void setNext(HashSetNode<T> next) {
        this.next = next;
    }
}
