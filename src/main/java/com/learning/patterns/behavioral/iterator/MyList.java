package com.learning.patterns.behavioral.iterator;

import java.util.List;

/**
 * Created by aliHitawala on 8/20/15.
 */
public class MyList<T> implements Collection<T>, Iterable<T> {
    List<T> list;

    public MyList(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterable getIterator() {
        return null;
    }

    @Override
    public int getSize() {
        return this.list.size();
    }

    @Override
    public T getItemAt(int i) {
        return this.list.get(i);
    }
}
