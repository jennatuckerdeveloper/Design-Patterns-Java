package com.codewithmost.memento;

public class Editor {
    private String content;
    // array of history that holds past contents

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // push contents to history
    }

    public void undo() {
        // pop from history
        // set that as current content
        // ensure edge case of last one empties content
    }
}
