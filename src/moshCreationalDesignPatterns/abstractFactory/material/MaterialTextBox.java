package moshCreationalDesignPatterns.abstractFactory.material;

import moshCreationalDesignPatterns.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material Textbox");
    }
}
