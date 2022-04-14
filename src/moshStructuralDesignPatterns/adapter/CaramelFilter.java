package moshStructuralDesignPatterns.adapter;

import moshStructuralDesignPatterns.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter{
    private Caramel avaFilter;

    public CaramelFilter(Caramel avaFilter) {
        this.avaFilter = avaFilter;
    }

    @Override
    public void apply(Image image) {
        avaFilter.init();
        avaFilter.render(image);
    }
}
