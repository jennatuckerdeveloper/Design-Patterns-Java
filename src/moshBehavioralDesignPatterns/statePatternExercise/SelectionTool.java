package moshBehavioralDesignPatterns.statePatternExercise;

public class SelectionTool extends Tool {

    @Override
    public void mouseDown()  {
        System.out.println("Selection Tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dotted rectangle.");
    }
}
