package moshBehavioralDesignPatterns.commandPatternExercise;

public class SetContrastCommandWithUndo implements CommandWithUndo{
    private float prevContrast;
    private VideoEditor editor;
    private History history;
    private float newContrast;

    public SetContrastCommandWithUndo(VideoEditor editor, History history, float newContrast) {
        this.editor = editor;
        this.history = history;
        this.newContrast = newContrast;
    }

    @Override
    public void execute() {
        prevContrast = editor.getContrast();
        editor.setContrast(newContrast);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setContrast(prevContrast);
    }
}
