package moshBehavioralDesignPatterns.statePatternExercise;

public class BrushTool extends Tool {
    @Override
    public void mouseUp() {
        System.out.println("Paint a line.");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush tool");

    }
}
