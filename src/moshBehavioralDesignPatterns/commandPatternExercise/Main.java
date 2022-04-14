package moshBehavioralDesignPatterns.commandPatternExercise;



public class Main {

    public static void main(String[] args) {
        var editor = new VideoEditor();
        var history = new History();
        var setContrastCommand = new SetContrastCommandWithUndo(editor, history, 7);
        setContrastCommand.execute();
        System.out.println(editor.toString());
//        setContrastCommand.unexecute();

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor.toString());

//        var history = new History();
//        var document = new HTMLDocument();
//        document.setContent("Hello World");
//        var boldCommand = new BoldCommand(document, history);
//        boldCommand.execute();
//        System.out.println(document.getContent());
////        boldCommand.unexecute();
////        System.out.println(document.getContent());
//
//        var undoCommand = new UndoCommand(history);
//        undoCommand.execute();
//        System.out.println(document.getContent());

//        var history = new History();
//        var setContrastCommand = new SetContrasthistory(editor, history);
//        System.out.println(editor.toString());

//        var undoCommand = new UndoCommand(history);
//        undoCommand.execute();
//        System.out.println(editor.toString());
//        undoCommand.execute();
//        System.out.println(editor.toString());
    }

}