package moshBehavioralDesignPatterns.commandPattern;

import moshBehavioralDesignPatterns.commandPattern.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
