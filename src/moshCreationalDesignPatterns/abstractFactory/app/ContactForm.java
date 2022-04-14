package moshCreationalDesignPatterns.abstractFactory.app;

import moshCreationalDesignPatterns.abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
