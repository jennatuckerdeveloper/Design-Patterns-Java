package com.codewithmost.iteratorPattern;

import javax.sql.rowset.BaseRowSet;

public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        var iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }

    // So we want to iterate over a history object without knowing its internals.
    // So lets make next() current() and hasNext() to iterate over this

}
