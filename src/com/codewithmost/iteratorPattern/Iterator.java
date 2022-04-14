package com.codewithmost.iteratorPattern;

//public interface Iterator<T> {
//    boolean isDone();
//    void next();
//    T current();
//}

public interface Iterator {
    boolean hasNext();
    void next();
    String current();
}
