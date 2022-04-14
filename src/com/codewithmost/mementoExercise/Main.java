package com.codewithmost.mementoExercise;

public class Main {

    public static void main(String[] args) {

       var document = new Document();
       var history = new History();

       document.setContent("a");
       history.push(document.createState());
       System.out.println(document.toString());
       document.setFontSize(12);
       document.setContent("ab");
       document.setFontName("Times");
       System.out.println(document.toString());
       document.restore(history.pop());
       System.out.println(document.toString());

    }

}