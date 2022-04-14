package moshCreationalDesignPatterns.abstractFactory.ant;

import moshCreationalDesignPatterns.abstractFactory.Button;
import moshCreationalDesignPatterns.abstractFactory.TextBox;
import moshCreationalDesignPatterns.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
