package moshBehavioralDesignPatterns.strategyPattern;

public class BWFilter implements Filter {
    @Override
    public void apply() {
        System.out.println("Applying B&W filter");
    }
}
