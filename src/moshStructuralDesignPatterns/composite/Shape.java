package moshStructuralDesignPatterns.composite;

import java.sql.SQLOutput;

public class Shape implements Component {
    @Override
    public void render() {
        System.out.println("Render shape");
    }

    @Override
    public void move() {
        System.out.println("Move shape");
    }
}
