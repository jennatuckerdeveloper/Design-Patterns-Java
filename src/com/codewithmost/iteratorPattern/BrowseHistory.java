package com.codewithmost.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

//    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count] = url;
        count++;
    }

    public String pop() {
        count --;
        return urls[count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls[index];
        }
    }

//    public class ListIterator implements Iterator {
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//    }
}
