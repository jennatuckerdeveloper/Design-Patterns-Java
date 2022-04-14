package com.codewithmost.commandPattern.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
