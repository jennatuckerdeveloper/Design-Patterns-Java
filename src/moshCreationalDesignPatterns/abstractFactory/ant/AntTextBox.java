package moshCreationalDesignPatterns.abstractFactory.ant;

import moshCreationalDesignPatterns.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
