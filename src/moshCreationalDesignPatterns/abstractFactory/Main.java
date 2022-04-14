package moshCreationalDesignPatterns.abstractFactory;

import moshCreationalDesignPatterns.abstractFactory.ant.AntWidgetFactory;
import moshCreationalDesignPatterns.abstractFactory.app.ContactForm;
import moshCreationalDesignPatterns.abstractFactory.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new AntWidgetFactory());
    }
}
