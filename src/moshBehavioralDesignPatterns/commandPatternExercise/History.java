package moshBehavioralDesignPatterns.commandPatternExercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<CommandWithUndo> commands = new ArrayDeque<>();

    public void push (CommandWithUndo command) {
        commands.add(command);
    }

    public CommandWithUndo pop() {
        return commands.pop();
    }

    public int size () {
        return commands.size();
    }
}
