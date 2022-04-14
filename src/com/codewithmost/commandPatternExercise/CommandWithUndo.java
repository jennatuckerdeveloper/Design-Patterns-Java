package com.codewithmost.commandPatternExercise;

public interface CommandWithUndo extends Command {
    void unexecute();
}
