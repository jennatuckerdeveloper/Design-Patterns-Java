package com.codewithmost.mediatorPattern;

public class UIControl {
    public UIControl(DialogBox owner) {
        this.owner = owner;
    }

    protected DialogBox owner;
}
