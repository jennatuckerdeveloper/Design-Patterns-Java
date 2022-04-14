package moshCreationalDesignPatterns.factory.matcha;

import java.util.Map;

public class Controller {


    public void render(String viewName, Map<String, Object> context) {
        var engine = createViewEngine();
        var html = engine.render(viewName,context);
        System.out.println(html);
    }

    // Could do this as an abstract method.
    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
