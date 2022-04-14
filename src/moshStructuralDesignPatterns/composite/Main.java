package moshStructuralDesignPatterns.composite;

// For dealing with an object hierarchy.
// Lets you treat objects in the hierarchy the same way.

public class Main {

    public static void main(String[] arts) {

        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();

    }
}
