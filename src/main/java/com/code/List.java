package com.code;

public interface List<E> {
    void add(int index, E e);
    E get(int index);
    void remove(int index);
    int size ();
}
