package moshStructuralDesignPatterns.adapter;

import moshStructuralDesignPatterns.adapter.avaFilters.Caramel;


// Favor composition over inheritance.
// Because in Java, we don't have multiple inheritance.
// Here, Filter is an interface.
// As an abstract class, this won't work.

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
