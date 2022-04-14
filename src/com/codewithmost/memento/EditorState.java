package com.codewithmost.memento;

public class EditorState {
    // final makes this essentially immutable
    private final String content;

    public EditorState (String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
