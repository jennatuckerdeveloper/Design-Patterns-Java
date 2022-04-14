package com.codewithmost.statePattern;

public class Main {

    public static void main(String[] args) {

        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }

}