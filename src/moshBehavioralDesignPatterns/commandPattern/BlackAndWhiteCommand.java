package moshBehavioralDesignPatterns.commandPattern;

import moshBehavioralDesignPatterns.commandPattern.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
