package com.codewithmost.statePatternExercise;

public abstract class Tool {
    public void showActive () {
        System.out.println("Current Tool highlighted");
    }
    public abstract void mouseUp();
    public abstract void mouseDown();

}

