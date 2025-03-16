package org.hslu.ex_4;

import java.util.Objects;

public class HashSet<T> implements IHashset<T> {
    private HashSetNode<T>[] nodes;
    private final int IS_FULL_THRESHOLD_IN_PERCENT = 80;
    private final int RESIZE_FACTOR = 2;
    private int size = 0;

    public HashSet(int initialSize) {
        nodes = new HashSetNode[initialSize];
    }

    @Override
    public void add(T value) {
        if (isFull()) {
            resize();
        }
        var current = nodes[getIndex(value)];
        if (current == null) {
            nodes[getIndex(value)] = new HashSetNode<>(value);
        } else {
            while (current.getNext() != null) {
                if (current.getValue().equals(value)) {
                    return;
                }
                current = current.getNext();
            }
            current.setNext(new HashSetNode<>(value));
        }
        size++;
    }

    @Override
    public void remove(T value) {
        var current = nodes[getIndex(value)];
        if (current == null) {
            return;
        }
        if (current.getValue().equals(value)) {
            nodes[getIndex(value)] = current.getNext();
            size--;
            return;
        }
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    private void resize() {
        var clone = nodes.clone();;
        nodes = new HashSetNode[nodes.length * RESIZE_FACTOR];
        for (int i = 0; i < clone.length; i++) {
            var current = clone[i];
            if (current != null) {
                nodes[i] = current;
            }

        }
    }

    private boolean isFull() {
        return size >= nodes.length * IS_FULL_THRESHOLD_IN_PERCENT / 100;
    }

    private int getIndex(T value) {
        return Objects.hashCode(value) % nodes.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (var node : nodes) {
            if (node == null) {
                sb.append("null ");
            } else {
                var current = node;
                while (current != null) {
                    sb.append(current.getValue() + " ");
                    current = current.getNext();
                }
            }
        }
        return sb.toString();
    }

    public int getSize() {
        return size;
    }
}
