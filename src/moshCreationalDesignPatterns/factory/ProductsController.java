package moshCreationalDesignPatterns.factory;

import moshCreationalDesignPatterns.factory.matcha.Controller;
import moshCreationalDesignPatterns.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProduces() {
        // Get products from a db
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context);
    }
}
