package com.learning.patterns.behavioral.iterator;


/**
 * Created by aliHitawala on 8/20/15.
 */
public class MyListIterator<T> extends Iterator<T> {
    public MyListIterator(Collection<T> list) {
        super(list);
    }
}
