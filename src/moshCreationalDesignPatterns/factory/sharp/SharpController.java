package moshCreationalDesignPatterns.factory.sharp;

import moshCreationalDesignPatterns.factory.matcha.Controller;
import moshCreationalDesignPatterns.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
