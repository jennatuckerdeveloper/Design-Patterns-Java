package moshCreationalDesignPatterns.abstractFactory.ant;

import moshCreationalDesignPatterns.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant button.");
    }
}
