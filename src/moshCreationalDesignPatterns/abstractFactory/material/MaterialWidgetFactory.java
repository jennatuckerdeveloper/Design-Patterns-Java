package moshCreationalDesignPatterns.abstractFactory.material;

import moshCreationalDesignPatterns.abstractFactory.Button;
import moshCreationalDesignPatterns.abstractFactory.TextBox;
import moshCreationalDesignPatterns.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
