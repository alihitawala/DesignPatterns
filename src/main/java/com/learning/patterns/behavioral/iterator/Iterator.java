package com.learning.patterns.behavioral.iterator;

/**
 * Created by aliHitawala on 8/20/15.
 */
public class Iterator<T> {
    Collection<T> list;
    int pointer;
    public Iterator(Collection<T> list) {
        this.list = list;
        pointer=0;
    }

    public boolean hasNext() {
        if (pointer >= this.list.getSize())
            return false;
        return true;
    }

    public T next() {
        if (this.list.getSize() > pointer) {
            T item = this.list.getItemAt(pointer);
            pointer++;
            return item;
        }
        throw new RuntimeException("List is exhausted");
    }
}
